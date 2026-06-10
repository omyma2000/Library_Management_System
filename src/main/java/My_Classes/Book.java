
package My_Classes;

import DataBase.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author omayma
 */
public class Book {
    private Integer id;
    private  String isbn;
    private  String name;
    private  Integer author_id;
    private  Integer genre_id;
    private  Integer quantity;
    private  String publisher;
    private  double price;
    private  String date_revived ;
    private  String description;
    private byte [] cover;
    
   public Book(){}
    public Book(Integer _id, String _isbn,String _name,Integer _author_id,Integer _genre_id,Integer _quantity , String _publisher,String _date_revived, double _price,String _description,byte [] _cover)
    {
    this.id=_id;
    this.isbn = _isbn;
    this.name=_name;
    this.author_id=_author_id;
    this.genre_id= _genre_id;
    this.quantity= _quantity;
    this.publisher= _publisher;
    this.date_revived=_date_revived;
    this.price = _price;
    this.description=_description;
    this.cover=_cover;
     }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate_revived() {
        return date_revived;
    }

    public void setDate_revived(String date_revived) {
        this.date_revived = date_revived;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }
     Function_Class func = new Function_Class();
     public void addBook( String _isbn,String _name,Integer _author_id,Integer _genre_id,Integer _quantity , String _publisher,String _date_revived, double _price,String _description,byte [] _cover) {

        String sql = "INSERT INTO `books`(`isbn`, `name`, `author_id`, `genre_id`, `quantity`, `publisher`, `date_revived`, `price`, `description`, `cover_image`) VALUES (?,?,?,?,?,?,?,?,?,?)";

        try (PreparedStatement ps = DB.getConnection().prepareStatement(sql)) {

            ps.setString(1, _isbn);
            ps.setString(2, _name);
            ps.setInt(3, _author_id);
            ps.setInt(4, _genre_id);
            ps.setInt(5, _quantity);
            ps.setString(6, _publisher);
            ps.setString(7, _date_revived);
            ps.setDouble(8, _price);
            ps.setString(9, _description);
            ps.setBytes(10,_cover);
            
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "A New Book Added","Add Book",1);
            } else {
                JOptionPane.showMessageDialog(null, "Book Not Added","Add Book",1);
            }

        } catch (SQLException ex) {
           
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
     
public boolean isISBNexists(String _isbn)
{
    String query = "SELECT * FROM books WHERE isbn = '" + _isbn + "'";

    Function_Class func = new Function_Class();
    ResultSet rs = func.getData(query);

    try {

        if(rs.next()){
            return true;   // ISBN موجود
        }
        else 
        {
        return false; 
        }

    } catch (SQLException ex) {
        Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
    }

    return true; // ISBN غير موجود
}
public Book searchBookByID(int _id)
{
    String query = "SELECT * FROM books WHERE id = " + _id;

    ResultSet rs = func.getData(query);
    Book book = null;

    try
    {
        if(rs != null && rs.next())
        {
            book = new Book(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getInt(5),
                rs.getInt(6),
                rs.getString(7),
                rs.getString(8),
                rs.getDouble(9),
                rs.getString(10),
                rs.getBytes(11)
            );
        }
    }
    catch(SQLException ex)
    {
        Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
    }

    return book;
}
public Book searchBookByISBN(String _isbn)
{
    String query = "SELECT * FROM books WHERE isbn = '" + _isbn + "'";

    ResultSet rs = func.getData(query);
    Book book = null;

    try
    {
        if(rs != null && rs.next())
        {
            book = new Book(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getInt(5),
                rs.getInt(6),
                rs.getString(7),
                rs.getString(8),
                rs.getDouble(9),
                rs.getString(10),
                rs.getBytes(11)
            );
        }
    }
    catch(SQLException ex)
    {
        Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
    }

    return book;
}
public void editBook(int _id,
                     String _name,
                     Integer _authorId,
                     Integer _genreId,
                     Integer _quantity,
                     String _publisher,
                     String _date,
                     double _price,
                     String _description,
                     byte[] _cover)
{
    String updatequery =
        "UPDATE books SET " +
        "name=?, author_id=?, genre_id=?, quantity=?, publisher=?, " +
        "date_revived=?, price=?, description=?, cover_image=? " +
        "WHERE id=?";

    try
    {
        PreparedStatement ps = DB.getConnection().prepareStatement(updatequery);

        ps.setString(1, _name);
        ps.setInt(2, _authorId);
        ps.setInt(3, _genreId);
        ps.setInt(4, _quantity);
        ps.setString(5, _publisher);
        ps.setString(6, _date);
        ps.setDouble(7, _price);
        ps.setString(8, _description);
        ps.setBytes(9, _cover);
        ps.setInt(10, _id);

        // ✅ الصورة اختيارية
        if (_cover != null)
            ps.setBytes(9, _cover);
        else
            ps.setNull(9, java.sql.Types.BLOB);

        ps.setInt(10, _id);

        int result = ps.executeUpdate();

        if (result > 0)
            JOptionPane.showMessageDialog(null, "Book Updated Successfully");
        else
            JOptionPane.showMessageDialog(null, "No Book Found with this ID");

        ps.close();
    }
    catch(SQLException ex)
    {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "DB Error: " + ex.getMessage());
    }
}
}