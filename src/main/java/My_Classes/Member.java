/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package My_Classes;

import DataBase.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LCS
 */
public class Member {
     private  int id ;
    private String firstName;
    private String lasttName;
    private String phone;
    private String email;
    private String gender;
    private byte [] photo;
   
    
 public Member(){}

    public Member(int _id, String _ftName , String _LtName,String _phone, String _email , String _gender , byte[] _photo )
    {
    this.id=_id;
    this.firstName=_ftName;
    this.lasttName=_LtName;
    this.phone=_phone;
    this.email= _email;
    this.gender=_gender;
    this.photo=_photo;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
     // add member 
public void addMember(String _fname, String _Lname, String _phone, String _email,String _gender ,byte [] _photo){
   
String insertQuery ="INSERT INTO `members` (`firstName`, `lastName`, `phoneNo`, `email`, `gender`, `photo`) VALUES (?,?,?,?,?,?)";
    try {

        PreparedStatement ps =    DB.getConnection().prepareStatement(insertQuery);

        ps.setString(1, _fname);
        ps.setString(2, _Lname);
        ps.setString(3, _phone);
        ps.setString(4, _email);
        ps.setString(5, _gender);
        ps.setBytes(6, _photo);
        if(ps.executeUpdate() != 0){

            JOptionPane.showMessageDialog(null, " A New Member Added",  "Add Member",1 );

        }else{

            JOptionPane.showMessageDialog(  null,   "Member Not Added",  "Add Member", 2 );
        }

    } catch (SQLException ex) {
        Logger.getLogger(Member.class.getName()).log(Level.SEVERE,null,ex);
    }
    
       }
// to edit member  by id 
public void editmember(Integer _id , String _fname, String _Lname, String _phone, String _email,String _gender ,byte [] _photo){
    String editQuery ="UPDATE `members` SET `firstName`=?,`lastName`=?,`phoneNo`=?,`email`=?,'gender' ,`photo`=?  WHERE `id`=?";

    try {

        PreparedStatement ps =    DB.getConnection().prepareStatement(editQuery);
        ps.setInt(1, _id);
        ps.setString(2, _fname);
        ps.setString(3, _Lname);
        ps.setString(4, _phone);
        ps.setString(5, _email);
        ps.setString(6, _gender);
        ps.setBytes(7, _photo);
        
        

        if(ps.executeUpdate() == 1){

            JOptionPane.showMessageDialog(null, "Member Updated",  "Edit Member",1 );

        }else{

            JOptionPane.showMessageDialog(  null,   "Member Not Updated",  "Member Author", 2 );
        }

    } catch (SQLException ex) {
        Logger.getLogger(Member.class.getName()).log(Level.SEVERE,null,ex);
    }
    
}
    // to remove Members by ID
    public void deleteAuthor(int _id ){

    String deleteQuery = "DELETE FROM `members` WHERE `id`=?";

    try {

        PreparedStatement ps =    DB.getConnection().prepareStatement(deleteQuery);
       
        ps.setInt(1,  _id);
        

        if(ps.executeUpdate() == 1){

            JOptionPane.showMessageDialog(null, "Member Deleted",  "Delete Members",1 );

        }else{

            JOptionPane.showMessageDialog(  null,   "Member Not Deleted",  "Delete Members", 2 );
        }

    } catch (SQLException ex) {
        Logger.getLogger(Member.class.getName()).log(Level.SEVERE,null,ex);
    }  
}
    //get member by ID
  public Member getMemberByID(Integer _id) throws SQLException{
      Function_Class fc =new  Function_Class();
      String query = "SELECT * FROM `members` WHERE `id`="+_id;
      ResultSet rs =  fc.getData(query);
       if(rs.next() ){
       return  new Member(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getBytes(7));
       }else {
       return null;
       }
   }
}