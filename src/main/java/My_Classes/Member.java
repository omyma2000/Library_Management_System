package My_Classes;

import DataBase.DB;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Member {

    private int id;
    private String firstName;
    private String lasttName; // يفضل لاحقاً تعديلها إملائياً إلى lastName لتوحيد الكود
    private String phone;
    private String email;
    private String gender;
    private byte[] photo;

    public Member() {}

    public Member(int _id, String _ftName, String _LtName, String _phone,
                  String _email, String _gender, byte[] _photo) {
        this.id = _id;
        this.firstName = _ftName;
        this.lasttName = _LtName;
        this.phone = _phone;
        this.email = _email;
        this.gender = _gender;
        this.photo = _photo;
    }

    // ================= GETTERS / SETTERS =================

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLasttName() { return lasttName; }
    public void setLasttName(String lasttName) { this.lasttName = lasttName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public byte[] getPhoto() { return photo; }
    public void setPhoto(byte[] photo) { this.photo = photo; }

    // ================= ADD MEMBER =================

    public void addMember(String _fname, String _Lname, String _phone,
                          String _email, String _gender, byte[] _photo) {

        String sql = "INSERT INTO members (firstName, lastName, phoneNo, email, gender, photo) "
                   + "VALUES (?,?,?,?,?,?)";

        try (PreparedStatement ps = DB.getConnection().prepareStatement(sql)) {

            ps.setString(1, _fname);
            ps.setString(2, _Lname);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _photo);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "A New Member Added");
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Added");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
    }

    // ================= EDIT MEMBER =================

    public void editmember(int _id, String _fname, String _Lname,
                           String _phone, String _email,
                           String _gender, byte[] _photo) {

        String sql = "UPDATE members SET firstName=?, lastName=?, phoneNo=?, "
                   + "email=?, gender=?, photo=? WHERE id=?";

        try (PreparedStatement ps = DB.getConnection().prepareStatement(sql)) {

            ps.setString(1, _fname);
            ps.setString(2, _Lname);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _photo);
            ps.setInt(7, _id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Member Updated");
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Updated");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
    }

    // ================= DELETE MEMBER =================

    public void deleteMember(int _id) {

        String sql = "DELETE FROM members WHERE id=?";

        try (PreparedStatement ps = DB.getConnection().prepareStatement(sql)) {

            ps.setInt(1, _id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Member Deleted");
            } else {
                JOptionPane.showMessageDialog(null, "Member Not Deleted");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
    }

    // ================= GET MEMBER BY ID =================
    // تم إضافة throws SQLException لكي يراها الـ try-catch في الواجهات الخارجية
    public Member getMemberByID(int _id) throws SQLException {

        String sql = "SELECT * FROM members WHERE id=?";

        try (PreparedStatement ps = DB.getConnection().prepareStatement(sql)) {

            ps.setInt(1, _id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Member(
                            rs.getInt("id"),
                            rs.getString("firstName"),
                            rs.getString("lastName"),
                            rs.getString("phoneNo"),
                            rs.getString("email"),
                            rs.getString("gender"),
                            rs.getBytes("photo")
                    );
                }
            }
        }
        return null;
    }

    // ================= LIST MEMBERS =================
    // تم إضافة throws SQLException لحل مشكلة استدعائها في جدول عرض الأعضاء
    public ArrayList<Member> membersList(String query) throws SQLException {

        ArrayList<Member> list = new ArrayList<>();

        if (query == null || query.isEmpty()) {
            query = "SELECT * FROM members";
        }

        try (PreparedStatement ps = DB.getConnection().prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Member(
                        rs.getInt("id"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("phoneNo"),
                        rs.getString("email"),
                        rs.getString("gender"),
                        rs.getBytes("photo")
                ));
            }
        }
        return list;
    }
}