
package Library_Domain;

import Library_Data.DB;
import Library_Business.Function_Class;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author omyama
 */
// ==========   inheritance ===================
public class Authors extends Person{
    
    
    private String field_Of_Expertise;
    private String about;
public Authors(){
super();
}

Library_Business.Function_Class func = new Library_Business.Function_Class();

    public Authors(int _id, String _fName , String _LName,String _expertise, String _about)
    {
    super(_id,_fName,_LName );
    this.field_Of_Expertise=_expertise;
    this.about= _about;
    
    }

    //================   Getter and Setter   ==========================
    public String getField_Of_Expertise() {
        return field_Of_Expertise;
    }

    public void setField_Of_Expertise(String field_Of_Expertise) {
        this.field_Of_Expertise = field_Of_Expertise;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
     // add Author 
public void addAuthor(String _fname, String _Lname, String _expertise, String _about){

    String insertQuery ="INSERT INTO `author`( `firstName`, `lastName`, `expertise`, `about`) VALUES (?,?,?,?)";

    try {

        PreparedStatement ps =    DB.getConnection().prepareStatement(insertQuery);

        ps.setString(1, _fname);
        ps.setString(2, _Lname);
        ps.setString(3, _expertise);
        ps.setString(4, _about);

        if(ps.executeUpdate() != 0){

            JOptionPane.showMessageDialog(null, "Author Added",  "Add Author",1 );

        }else{

            JOptionPane.showMessageDialog(  null,   "Author Not Added",  "Add Author", 2 );
        }

    } catch (SQLException ex) {
        Logger.getLogger(Authors.class.getName()).log(Level.SEVERE,null,ex);
    }
    
       }
// to edit Author  by id 
public void editAuthor(int _id , String _fname, String _Lname, String _expertise, String _about){

    String editQuery ="UPDATE `author` SET `firstName`=?,`lastName`=?,`expertise`=?,`about`=? WHERE `id`=?";

    try {

        PreparedStatement ps =    DB.getConnection().prepareStatement(editQuery);
        ps.setString(1,  _fname);
        ps.setString(2,  _Lname);
        ps.setString(3,  _expertise);
        ps.setString(4,  _about);
        ps.setInt(5,  _id);
        

        if(ps.executeUpdate() == 1){

            JOptionPane.showMessageDialog(null, "Author Updated",  "Edit Author",1 );

        }else{

            JOptionPane.showMessageDialog(  null,   "Author Not Updated",  "Edit Author", 2 );
        }

    } catch (SQLException ex) {
        Logger.getLogger(Authors.class.getName()).log(Level.SEVERE,null,ex);
    }
    
}
    // to remove Author by ID
    public void deleteAuthor(int _id ){

    String deleteQuery = "DELETE FROM `author` WHERE `id`=?";

    try {

        PreparedStatement ps =    DB.getConnection().prepareStatement(deleteQuery);
       
        ps.setInt(1,  _id);
        

        if(ps.executeUpdate() == 1){

            JOptionPane.showMessageDialog(null, "Author Deleted",  "Delete Author",1 );

        }else{

            JOptionPane.showMessageDialog(  null,   "Author Not Deleted",  "Delete Author", 2 );
        }

    } catch (SQLException ex) {
        Logger.getLogger(Authors.class.getName()).log(Level.SEVERE,null,ex);
    }  
}
     // function to populate an arraylist with Authors
    public ArrayList<Authors>authorsList()
    {
            ArrayList<Authors> aList = new ArrayList<>();
            Library_Business.Function_Class function = new Function_Class();
       
            
            try {
                 
            ResultSet rs= function.getData("SELECT * FROM `author`");
            Authors authors;
            while (rs.next()) {                                      
               authors = new Authors(rs.getInt("id"),
                       rs.getString("firstName"),
                       rs.getString("lastName"),
                       rs.getString("expertise"),
                       rs.getString("about"));
               aList.add(authors);
            }
            
            
        } catch (SQLException ex) {
            System.getLogger(Authors.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return  aList;
    }
    //
    
    
public Authors getAuthorsByID(Integer id){
    ResultSet rs= func.getData("SELECT * FROM `author` where id="+id);
        Authors authors = null ;
        try {
            if (rs.next()) {
                authors = new Authors(rs.getInt("id"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("expertise"),
                        rs.getString("about"));
                  
            }
        } catch (SQLException ex) {
            System.getLogger(Authors.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return authors;
}

    @Override
    public void printInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}