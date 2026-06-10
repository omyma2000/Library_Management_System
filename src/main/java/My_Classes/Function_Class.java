package My_Classes;
import DataBase.DB;
import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Function_Class {
     // image display function in jLabel1
   public void displayImage(int width, int height, byte[] imagebyte, String imagePath, JLabel label) {

    try {
        ImageIcon imageIcon;

        if (imagebyte != null && imagebyte.length > 0) {

            imageIcon = new ImageIcon(imagebyte);

        } else if (imagePath != null && !imagePath.isEmpty()) {

            imageIcon = new ImageIcon(imagePath);

        } else {

            System.out.println("No image provided!");
            return;
        }

        Image image = imageIcon.getImage()
                .getScaledInstance(width, height, Image.SCALE_SMOOTH);

        label.setIcon(new ImageIcon(image));

    } catch (Exception e) {

        e.printStackTrace();
        System.out.println("Error loading image");
    }
}
    //costomize function 
    public void customizeTable(JTable table){
    // customize table 
        table.setSelectionBackground(new Color(249,105,14));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(30);
        table.setShowGrid(false);
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.yellow);
    }
          // customize Header table 
        public void customizeHeaderTable(JTable table, Color back_Color , Integer fontSize){
          // customize the header table row
        table.getTableHeader().setBackground(back_Color);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana",Font.BOLD,fontSize));
        table.getTableHeader().setOpaque(false); // نقدر نكبر ونصغر الاعمدة ف الجدول 
         }
        //create function to select image 
        //return image path
        public String selectImage()
        {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");
        fileChooser.setCurrentDirectory(new File("C:\\Users\\LCS\\OneDrive\\الصور"));
        
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image Files", "png", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);
        
        int fileState = fileChooser.showOpenDialog(null); // تم تعديلها لفتح وليس حفظ
         String path= " ";
        if (fileState == JFileChooser.APPROVE_OPTION) {
            
                 path = fileChooser.getSelectedFile().getAbsolutePath();
              }
            return path ;
        }
        
    
    
    // return resultSet function 
    public ResultSet getData(String query ){
   // String selectQuery = "SELECT *FROM 'author'";
        PreparedStatement ps;
        ResultSet rs = null ;
        try {
            ps=DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Function_Class.class.getName()).log(Level.SEVERE,null,ex);
        }
    
    return rs;
    }
  
}
