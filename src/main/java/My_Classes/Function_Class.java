/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package My_Classes;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author omayma
 */
public class Function_Class {
     // image display function in jLabel1
    public void displayImage(int width , int height, String imagePath , JLabel label ){
        //get image 
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));
        // make image fit jLabel 
        Image image = imageIcon.getImage().getScaledInstance(width, height ,Image.SCALE_SMOOTH);
        // set image into jLabel
        label.setIcon(new ImageIcon(image));
    }
}
