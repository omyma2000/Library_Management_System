package My_Classes;
import DataBase.DB;
import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

public class Function_Class {
     // image display function in jLabel1
    public void displayImage(int width , int height,byte[]imagebyte,String imagePath , JLabel label ){
        //get image 
        ImageIcon imageIcon;
        if(imagebyte!= null){ // get image by bytes
        imageIcon = new ImageIcon(imagebyte);
        }else{    try {
             // get image using project resource 
            
        imageIcon = new ImageIcon(getClass().getResource(imagePath));
                
            } catch (Exception e) {
            //get image using desktop 
           imageIcon = new ImageIcon(imagePath);
            }
     
         }
          // make image fit jLabel 
        Image image = imageIcon.getImage().getScaledInstance(width, height ,Image.SCALE_SMOOTH);
        // set image into jLabel
        label.setIcon(new ImageIcon(image));
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
