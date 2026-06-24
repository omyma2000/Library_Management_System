
package Library_Business;

import Library_Domain.Book;
import Library_Data.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author omayma
 */
public class Issue_Book {
   private int book_id;
   private int member_id;
   private String status; // issued - returned - lost 
   private String issue_date;
   private String Returned_date;
   private String note;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getReturned_date() {
        return Returned_date;
    }

    public void setReturned_date(String Returned_date) {
        this.Returned_date = Returned_date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    public Issue_Book(){}
   
   public Issue_Book(int _book_id , int _member_id, String _status, String _issue_date, String _return_date , String _note ){
   this.book_id= _book_id;
   this.member_id=_member_id;
   this.status = _status;
   this.issue_date = _issue_date;
   this.Returned_date= _return_date;
   this.note=_note;
   
   }
   Book book = new Book();
   Function_Class function = new Function_Class();
    
   // add issue 
   public void addIssue(int _book_id, int _member_id , String _status , String _issue_date , String _Returned_date , String _note)
   {
      String  insertQuery = "INSERT INTO issue_book (`book_id`, `member_id`, `status`, `issue_date`, `return_date`, `note`) VALUES (?,?,?,?,?,?)"; 
      try (PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery)) {

            ps.setInt(1, _book_id);
            ps.setInt(2, _member_id);
            ps.setString(3, _status);
            ps.setString(4, _issue_date);
            ps.setString(5, _Returned_date);
            ps.setString(6, _note);
            
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Issue Added","Add Issue",1);
            } else {
                JOptionPane.showMessageDialog(null, "Issue Not Added","Add Issue",1);
            }

        } catch (SQLException ex) {
           
            Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE,null,ex);
        }
     }

public int countData(int _book_id) {
    int total = 0;
    ResultSet rs = null;
    PreparedStatement ps = null;
    try {
        // الاستعلام الصحيح مع التأكد من حالة الكتاب أنه مستعار حالياً 'issued'
        String query = "SELECT COUNT(*) as total FROM issue_book WHERE book_id = ? AND status = 'issued'";
        ps = DB.getConnection().prepareStatement(query);
        
        // تعبئة علامة الاستفهام (يجب أن تكون قبل التنفيذ)
        ps.setInt(1, _book_id);
        
        rs = ps.executeQuery();
        
        if (rs.next()) {
            total = rs.getInt("total");
        }
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Issue_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } finally {
        // تنظيف الذاكرة وإغلاق الأتصال المفتوح للـ PreparedStatement
        try { if (rs != null) rs.close(); } catch (SQLException e) {}
        try { if (ps != null) ps.close(); } catch (SQLException e) {}
    }
    return total;
}
// 1. الدالة المحدثة والوحيدة لفحص الإتاحة بشكل مضمون
public boolean checkBookAvailability(int _book_id) {
    boolean availability = false;
    PreparedStatement psBooks = null;
    PreparedStatement psIssues = null;
    ResultSet rsBooks = null;
    ResultSet rsIssues = null;
    
    try {
        // أ) جلب كمية الكتاب الكلية مباشرة من جدول الكتب (تأكدي من اسم الجدول والأعمدة عندك)
        String queryBooks = "SELECT quantity FROM books WHERE id = ?";
        psBooks = DB.getConnection().prepareStatement(queryBooks);
        psBooks.setInt(1, _book_id);
        rsBooks = psBooks.executeQuery();
        
        int totalQuantity = 0;
        if (rsBooks.next()) {
            totalQuantity = rsBooks.getInt("quantity");
        }
        
        // ب) حساب كم نسخة مستعارة حالياً 'issued' من هذا الكتاب
        String queryIssues = "SELECT COUNT(*) as total FROM issue_book WHERE book_id = ? AND status = 'issued'";
        psIssues = DB.getConnection().prepareStatement(queryIssues);
        psIssues.setInt(1, _book_id);
        rsIssues = psIssues.executeQuery();
        
        int currentlyIssued = 0;
        if (rsIssues.next()) {
            currentlyIssued = rsIssues.getInt("total");
        }
        
        // ج) طباعة في الـ Output للمراقبة والتأكد
        System.out.println("--- فحص الكتاب رقم: " + _book_id + " ---");
        System.out.println("الكمية الكلية في المكتبة: " + totalQuantity);
        System.out.println("العدد المستعار حالياً: " + currentlyIssued);
        
        // د) المقارنة الحاسمة: يكون متاح فقط لو الكمية الكلية أكبر من المستعارة
        if (totalQuantity > currentlyIssued) {
            availability = true;
        }
        
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Issue_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } finally {
        // إغلاق كل الأتconnections بأمان
        try { if (rsBooks != null) rsBooks.close(); } catch (SQLException e) {}
        try { if (psBooks != null) psBooks.close(); } catch (SQLException e) {}
        try { if (rsIssues != null) rsIssues.close(); } catch (SQLException e) {}
        try { if (psIssues != null) psIssues.close(); } catch (SQLException e) {}
    }
    
    return availability;
}
//===========================================================================
public boolean checkMemberExists(int _member_id) {
    boolean exists = false;
    PreparedStatement ps = null;
    ResultSet rs = null;
    try {
        // استعلام للتأكد من وجود العضو في جدول الأعضاء (تأكدي من اسم الجدول والأعمدة عندك)
        String query = "SELECT * FROM members WHERE id = ?";
        ps = DB.getConnection().prepareStatement(query);
        ps.setInt(1, _member_id);
        rs = ps.executeQuery();
        
        if (rs.next()) {
            exists = true; // العضو موجود فعلاً
        }
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Issue_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } finally {
        try { if (rs != null) rs.close(); } catch (SQLException e) {}
        try { if (ps != null) ps.close(); } catch (SQLException e) {}
    }
    return exists;
}
// to display issued , returned and lost books 
 public ArrayList<Issue_Book> issuedbooksList(String _status)
{
    ArrayList<Issue_Book> issuedbooksList = new ArrayList<>();
    String query;
    // if status Empty
    if(_status.equals("")){
    
       query  = "SELECT * FROM issue_book";
    
    }else{
   // show data
         query = "SELECT * FROM issue_book WHERE status = '"+ _status +"'";
       
    }
    try {
         ResultSet rs = function.getData(query);

       Issue_Book ib;

        while (rs.next()) {

            ib = new Issue_Book(
                rs.getInt(1),
                rs.getInt(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6));

            issuedbooksList.add(ib);
        }

    } catch (SQLException ex) {
        Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
    }

    return issuedbooksList;
}

    public boolean returnBook(int book_id, int member_id)
{
    String query = "UPDATE issue_book SET status=? "
                 + "WHERE book_id=? AND member_id=? AND status=?";

    try
    {
        PreparedStatement ps = DB.getConnection().prepareStatement(query);

        ps.setString(1, "returned");
        ps.setInt(2, book_id);
        ps.setInt(3, member_id);
        ps.setString(4, "issued");

        return ps.executeUpdate() > 0;
    }
    catch(SQLException ex)
    {
        Logger.getLogger(Issue_Book.class.getName()).log(Level.SEVERE, null, ex);
        return false;
    }
}
}
