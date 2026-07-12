package Library_Business;
import Library_Data.DB;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Function_Class extends BaseUI_Service{
    //customize function 
    @Override
    public void customizeTable(JTable table, Color backColor, Color fgColor){
        super.customizeTable(table, backColor, fgColor);
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.yellow);
    }
    
    // image display function in jLabel1
    public void displayImage(int width, int height, byte[] imagebyte, String imagePath, JLabel label) {
        try {
            ImageIcon imageIcon = null;

            // 1. التحقق أولاً من مصفوفة البايتات (القادمة من قاعدة البيانات)
            if (imagebyte != null && imagebyte.length > 0) {
                imageIcon = new ImageIcon(imagebyte);
            } 
            // 2. التحقق من المسار النصي مع إزالة أي مسافات زائدة باستخدام trim()
            else if (imagePath != null && !imagePath.trim().isEmpty()) {
                File file = new File(imagePath.trim());
                if (file.exists()) {
                    imageIcon = new ImageIcon(imagePath.trim());
                } else {
                    System.out.println("المسار غير موجود على الجهاز: " + imagePath);
                    label.setIcon(null); // تنظيف الجرافيك لو المسار غلط
                    return;
                }
            } 
            // 3. إذا لم يتوفر أي منهما
            else {
                System.out.println("No image provided!");
                label.setIcon(null); // إزالة الصورة القديمة من الـ JLabel
                return;
            }

            // تغيير حجم الصورة ليتلاءم مع حجم الـ JLabel
            Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(image));

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error loading image");
        }
    }
   
    // customize Header table 
    public void customizeHeaderTable(JTable table, Color back_Color , Integer fontSize){
        table.getTableHeader().setBackground(back_Color);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana",Font.BOLD,fontSize));
        table.getTableHeader().setOpaque(false); 
    }
        
    //create function to select image 
    //return image path
    public String selectImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");
        fileChooser.setCurrentDirectory(new File("C:\\Users\\LCS\\OneDrive\\الصور"));
        
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);
        
        int fileState = fileChooser.showOpenDialog(null); 
        
        String path = ""; // تم تعديلها هنا من " " إلى "" لمنع تخزين مسافات خاطئة
        
        if (fileState == JFileChooser.APPROVE_OPTION) {
            path = fileChooser.getSelectedFile().getAbsolutePath();
        }
        return path;
    }
        
    // return resultSet function 
    public ResultSet getData(String query ){
        PreparedStatement ps;
        ResultSet rs = null ;
        try {
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            } catch (SQLException ex) {
            Logger.getLogger(Function_Class.class.getName()).log(Level.SEVERE,null,ex);
        }
        return rs;
    }
    
    public int countData(String tableName){
        int total = 0 ;
        ResultSet rs;
        Statement st;
        try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery("SELECT COUNT(*) as total FROM "+tableName);
            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Function_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
}