
package My_Classes;

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
public class Genre {
    private int id;
    private String name;
    //constractors
    public Genre(){};
    public Genre(int _id,String _name){
    this.id = _id;
    this.name = _name;
    
    }
     //getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    //setter
    public void setId(int _id) {
        this.id = _id;
    }

    public void setName(String _name) {
        this.name = _name;
    }
    // add genre 
public void addGenre(String _name){

    String insertQuery ="INSERT INTO `book_genres`(`name`) VALUES (?)";

    try {

        PreparedStatement ps =    DB.getConnection().prepareStatement(insertQuery);

        ps.setString(1, _name);

        if(ps.executeUpdate() != 0){

            JOptionPane.showMessageDialog(null, "Genre Added",  "Add Genre",1 );

        }else{

            JOptionPane.showMessageDialog(  null,   "Genre Not Added",  "Add Genre", 2 );
        }

    } catch (SQLException ex) {
        Logger.getLogger(Genre.class.getName()).log(Level.SEVERE,null,ex);
    }
    
       }
// to edit genre  by id 
public void editGenre(int _id , String _name){

    String editQuery = "UPDATE book_genres SET name = ? WHERE id = ?";

    try {

        PreparedStatement ps =    DB.getConnection().prepareStatement(editQuery);
        ps.setString(1,  _name);
        ps.setInt(2,  _id);
        

        if(ps.executeUpdate() == 1){

            JOptionPane.showMessageDialog(null, "Genre Updated",  "Edit Genre",1 );

        }else{

            JOptionPane.showMessageDialog(  null,   "Genre Not Updated",  "Edit Genre", 2 );
        }

    } catch (SQLException ex) {
        Logger.getLogger(Genre.class.getName()).log(Level.SEVERE,null,ex);
    }
    
}
    // to remove genres by ID
    public void deleteGenre(int _id ){

    String deleteQuery = "DELETE FROM `book_genres` WHERE `id`=?";

    try {

        PreparedStatement ps =    DB.getConnection().prepareStatement(deleteQuery);
       
        ps.setInt(1,  _id);
        

        if(ps.executeUpdate() == 1){

            JOptionPane.showMessageDialog(null, "Genre Deleted",  "Delete Genre",1 );

        }else{

            JOptionPane.showMessageDialog(  null,   "Genre Not Deleted",  "Delete Genre", 2 );
        }

    } catch (SQLException ex) {
        Logger.getLogger(Genre.class.getName()).log(Level.SEVERE,null,ex);
    }
    
}
    // function to populate an arraylist with genres
    public ArrayList<Genre>genreList()
    {
            ArrayList<Genre> gList = new ArrayList<>();
            
            My_Classes.Function_Class function = new Function_Class();
         
        try {
           
            ResultSet rs= function.getData("SELECT * FROM `book_genres`");
         
            Genre genre;
            while (rs.next()) {                
               genre = new Genre(rs.getInt("id"),rs.getString("name"));
               gList.add(genre);
            }
            
            
        } catch (SQLException ex) {
            System.getLogger(Genre.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return  gList;
    }
    

}

