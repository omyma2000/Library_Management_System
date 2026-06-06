
package My_Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    String editQuery = "UPDATE book_genres SET name = ? WHERE id = ?";;

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
    
}

