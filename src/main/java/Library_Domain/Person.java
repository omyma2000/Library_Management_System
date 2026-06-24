/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library_Domain;

/**
 *
 * @author omayma
 */


// جعل الكلاس abstract يحقق المفهوم الأول
public abstract class Person {
    protected int id;
    protected String firstName;
    protected String lastName;

    public Person() {}

    public Person(int _id, String _fName, String _lName) {
        this.id = _id;
        this.firstName = _fName;
        this.lastName = _lName;
    }

    // دالة مجردة مجبر كل ابن يبرمجها بطريقته (تخدم مفهوم الـ Overriding لاحقاً)
    public abstract void printInfo();
    
    // Getters and Setters 
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
} 

