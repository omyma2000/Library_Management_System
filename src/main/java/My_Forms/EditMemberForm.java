package My_Forms;
import My_Classes.Authors;
import My_Classes.Member;
import My_Forms.DashboardForm;
import com.mysql.cj.xdevapi.Result;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omayma
 */

public class EditMemberForm extends javax.swing.JFrame {
    
   private static final java.util.logging.Logger logger =java.util.logging.Logger.getLogger(EditMemberForm.class.getName());
    /**
     * Creates new form ManageGenresForm
     */
   // member object 
    My_Classes.Member member = new My_Classes.Member();
     // function class instance  object 
    My_Classes.Function_Class func = new My_Classes.Function_Class();
    String imagePath =null;
    public EditMemberForm() {
        initComponents();
        // center form
        this.setLocationRelativeTo(null);
        
        // add borderto the panel Header                                      
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(1,152,117));
        jPanel1.setBorder(panelHeaderBorder);
        // add borderto the photo                                     
        Border JLabelImageBorder = BorderFactory.createMatteBorder(5, 5,5, 5, new Color(51,51,51));
        jLabel_image1.setBorder(JLabelImageBorder);
        
        //display image by path 
         func.displayImage(90, 60,null ,"/My_Images/Add_members.png", jLabel1);
        // customize table 
      //  func.customizeTable(jTable_Authors);
       // customize Header table 
     //  func.customizeHeaderTable(jTable_Authors, new Color(34,167,240), 16);
        // to hide thered sentence 
       jLabel_EmptyFname_.setVisible(false);
       jLabel_Empty_name2.setVisible(false);
       jLabel_Empty_Phone.setVisible(false);
      // populat Jtable with Authors
      //populatJtablewithAuthors();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField_NAME2 = new javax.swing.JTextField();
        jTextField_AboutAuthors = new javax.swing.JTextField();
        jButton_Edit = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jTextField_ID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Authors = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_about = new javax.swing.JTextArea();
        jLabel_Empty_Lname1 = new javax.swing.JLabel();
        jLabel_Empty_Lname = new javax.swing.JLabel();
        jLabel_Empty_Lname2 = new javax.swing.JLabel();
        jLabel_Empty_Fname1 = new javax.swing.JLabel();
        jLabel_Empty_Fname3 = new javax.swing.JLabel();
        jLabel_Photo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_First_NAME = new javax.swing.JTextField();
        jButton_Edit_members = new javax.swing.JButton();
        jLabel_EmptyFname_ = new javax.swing.JLabel();
        jTextField_Last_NAME = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBox_Gender = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jButton_selectPhoto = new javax.swing.JButton();
        jLabel_Empty_name2 = new javax.swing.JLabel();
        jLabel_Empty_Phone = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jLabel_Empty_Fname2 = new javax.swing.JLabel();
        jButton_Search = new javax.swing.JButton();
        jLabel_image1 = new javax.swing.JLabel();
        jLabel_Photo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jTextField_NAME2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_NAME2.addActionListener(this::jTextField_NAME2ActionPerformed);

        jTextField_AboutAuthors.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_AboutAuthors.addActionListener(this::jTextField_AboutAuthorsActionPerformed);

        jButton_Edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit.setText("Edit");
        jButton_Edit.addActionListener(this::jButton_EditActionPerformed);

        jButton_Delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(this::jButton_DeleteActionPerformed);

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_ID.addActionListener(this::jTextField_IDActionPerformed);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("ID:");

        jTable_Authors.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jTable_Authors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Authors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AuthorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Authors);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setText("About : ");

        jTextArea_about.setColumns(20);
        jTextArea_about.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextArea_about.setRows(5);
        jScrollPane2.setViewportView(jTextArea_about);

        jLabel_Empty_Lname1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Lname1.setText("* Enter the Last Name");
        jLabel_Empty_Lname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_Lname1MouseClicked(evt);
            }
        });

        jLabel_Empty_Lname.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Lname.setText("* Enter the Phone Number ");
        jLabel_Empty_Lname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_LnameMouseClicked(evt);
            }
        });

        jLabel_Empty_Lname2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Lname2.setText("* Enter the Email Address");
        jLabel_Empty_Lname2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_Lname2MouseClicked(evt);
            }
        });

        jLabel_Empty_Fname1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Fname1.setText("* Enter the First Name");
        jLabel_Empty_Fname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_Fname1MouseClicked(evt);
            }
        });

        jLabel_Empty_Fname3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Fname3.setText("* Enter the First Name");
        jLabel_Empty_Fname3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_Fname3MouseClicked(evt);
            }
        });

        jLabel_Photo.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel_Photo.setForeground(new java.awt.Color(51, 0, 255));
        jLabel_Photo.setText("choose Profile Picture....");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setText("Enter ID:");

        jTextField_First_NAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_First_NAME.addActionListener(this::jTextField_First_NAMEActionPerformed);

        jButton_Edit_members.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit_members.setText("Edit Member ");
        jButton_Edit_members.addActionListener(this::jButton_Edit_membersActionPerformed);

        jLabel_EmptyFname_.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_EmptyFname_.setText("* Enter the First Name");
        jLabel_EmptyFname_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFname_MouseClicked(evt);
            }
        });

        jTextField_Last_NAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Last_NAME.addActionListener(this::jTextField_Last_NAMEActionPerformed);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel9.setText("Last Name:");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel11.setText("Phone No:");

        jTextField_Phone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Phone.addActionListener(this::jTextField_PhoneActionPerformed);

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setText("Profile Picture:");

        jTextField_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Email.addActionListener(this::jTextField_EmailActionPerformed);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel13.setText("Email:");

        jComboBox_Gender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setText("Gender:");

        jButton_selectPhoto.setText("Select Profile Picture:");
        jButton_selectPhoto.addActionListener(this::jButton_selectPhotoActionPerformed);

        jLabel_Empty_name2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_name2.setText("* Enter the Last Name");
        jLabel_Empty_name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_name2MouseClicked(evt);
            }
        });

        jLabel_Empty_Phone.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Phone.setText("* Enter the Phone Number ");
        jLabel_Empty_Phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_PhoneMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel6.setText("First Name");

        jTextField_Id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Id.addActionListener(this::jTextField_IdActionPerformed);

        jLabel_Empty_Fname2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Fname2.setText("* Enter the ID to search ");
        jLabel_Empty_Fname2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_Fname2MouseClicked(evt);
            }
        });

        jButton_Search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Search.setText("Search");
        jButton_Search.addActionListener(this::jButton_SearchActionPerformed);

        jLabel_image1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel_image1.setOpaque(true);

        jLabel_Photo1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel_Photo1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel_Photo1.setText("choose Profile Picture....");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_image1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_selectPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Photo1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_First_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_EmptyFname_))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Last_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Empty_name2))
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_Empty_Phone)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Empty_Fname2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(jTextField_Id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton_Edit_members, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Empty_Fname2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_First_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_EmptyFname_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Empty_name2)
                    .addComponent(jTextField_Last_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Empty_Phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Photo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton_selectPhoto))
                    .addComponent(jLabel_image1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_Edit_members, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(1, 152, 117));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Member Information");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        //close form
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField_First_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_First_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_First_NAMEActionPerformed

    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
          
        
   
        
       /* {
            try{
             int id = Integer.parseInt(jTextField_ID.getText());
             member.editMember(id, fname, Lname, phone, gender);
             
                  //  populat Jtable with Authors
              //     populatJtablewithAuthors();
            }
            catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null,"Invalid Author ID: " + ex.getMessage(),"Error",0);
            
            }
            }*/
        
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton_Edit_membersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_membersActionPerformed
       
        // edit new member
        //hide empty jlabel
        jLabel_EmptyFname_.setVisible(false);
        jLabel_Empty_Lname.setVisible(false);
        jLabel_Empty_Phone.setVisible(false);
        //get member data 
        String fname = jTextField_First_NAME.getText();
        String Lname = jTextField_Last_NAME.getText();
        String phone = jTextField_Phone.getText();
        String email = jTextField_Email.getText();
        String gender = jComboBox_Gender.getSelectedItem().toString();
            if(fname.isEmpty()){
        System.out.println("First name is Emoty Value!");
        jLabel_EmptyFname_.setVisible(true);
        }else if (Lname.isEmpty()){
          System.out.println("Last name is Emoty Value!");
       jLabel_Empty_Lname.setVisible(true);
         }else if (phone.isEmpty()){
         
         jLabel_Empty_Phone.setVisible(true);
         }
         else{
         byte[] img = null;
         if (imagePath != null){
        
             try {
                 Integer id = Integer.parseInt(jTextField_Id.getText());
                 Path path = Paths.get(imagePath);
                 img = Files.readAllBytes(path);
                 member.editmember(id ,fname, Lname, phone, email, gender, img);
             } catch (IOException ex) {
                 System.getLogger(EditMemberForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
             }
         
         
         }else
         {
         
         JOptionPane.showMessageDialog(null,"select a profile picture ","no picture selected", 0);
         }
         
         }
    }//GEN-LAST:event_jButton_Edit_membersActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
         

    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jTable_AuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AuthorsMouseClicked
//display the selected author 
    //get the selected row index 
    int index = jTable_Authors.getSelectedRow();
    //get values 
     String id= jTable_Authors.getValueAt(index, 0).toString();
     String firstName= jTable_Authors.getValueAt(index, 1).toString();
     String lastName= jTable_Authors.getValueAt(index, 2).toString();
     String expersite= jTable_Authors.getValueAt(index, 3).toString();
     String about= jTable_Authors.getValueAt(index, 4).toString();
   
    // show data text fields 
    jTextField_ID.setText(id);
    jTextField_First_NAME.setText(firstName);
    jTextField_Last_NAME.setText(lastName);
    jTextField_Phone.setText(expersite);
    jTextField_AboutAuthors.setText(about);
    
    
    }//GEN-LAST:event_jTable_AuthorsMouseClicked

    private void jLabel_EmptyFname_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFname_MouseClicked
        //hide jlabel on click
        jLabel_EmptyFname_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyFname_MouseClicked

    private void jTextField_Last_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Last_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Last_NAMEActionPerformed

    private void jTextField_NAME2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NAME2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NAME2ActionPerformed

    private void jTextField_AboutAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AboutAuthorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AboutAuthorsActionPerformed

    private void jLabel_Empty_LnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_LnameMouseClicked
        
        jLabel_Empty_Lname.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_LnameMouseClicked

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jTextField_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PhoneActionPerformed

    private void jLabel_Empty_Lname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_Lname1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Empty_Lname1MouseClicked

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    private void jLabel_Empty_Lname2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_Lname2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Empty_Lname2MouseClicked

    private void jLabel_Empty_Fname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_Fname1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Empty_Fname1MouseClicked

    private void jLabel_Empty_name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_name2MouseClicked
        jLabel_Empty_name2.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_name2MouseClicked

    private void jLabel_Empty_Fname3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_Fname3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Empty_Fname3MouseClicked

    private void jLabel_Empty_PhoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_PhoneMouseClicked
        // TODO add your handling code here:
        jLabel_Empty_Phone.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_PhoneMouseClicked

    private void jButton_selectPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_selectPhotoActionPerformed
        // TODO add your handling code here:
        // select photo from your CMP 
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture ");
        fileChooser.setCurrentDirectory(new File ("C:\\Users\\LCS\\OneDrive\\الصور"));
        FileNameExtensionFilter ExtensionFilter = new FileNameExtensionFilter("Image",".png",".jpg","jpeg");
        fileChooser.addChoosableFileFilter(ExtensionFilter);
        int fileState = fileChooser.showSaveDialog(null);
        if(fileState == JFileChooser.APPROVE_OPTION){
        String path = fileChooser.getSelectedFile().getAbsolutePath();
        jLabel_Photo.setText(path);
        imagePath = path;
        // display the image 
        func.displayImage(297, 114, null, path, jLabel_image1);
        
        }
        
        
        
    }//GEN-LAST:event_jButton_selectPhotoActionPerformed

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jLabel_Empty_Fname2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_Fname2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Empty_Fname2MouseClicked

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        // TODO add your handling code here:
        // search by ID
        
        
        Member SelectMember = null;
       try {
           Integer id = Integer.parseInt(jTextField_Id.getText());
           SelectMember = member.getMemberByID(id);
           if(SelectMember!= null){
         System.out.println(SelectMember.getFirstName());
        jTextField_Id.setText(String.valueOf( SelectMember.getId()));
        jTextField_First_NAME.setText(SelectMember.getFirstName());
        jTextField_Last_NAME.setText(SelectMember.getLasttName());
        jTextField_Phone.setText(SelectMember.getPhone());
        jTextField_Email.setText(SelectMember.getEmail());
        jComboBox_Gender.setSelectedItem(SelectMember.getGender());
        // display the member image :
        byte[] image = SelectMember.getPhoto();
        //display image by byte 
        // empty path and not null byte
        func.displayImage(297, 114,image ,"", jLabel_image1);
        }else{
            JOptionPane.showMessageDialog(null, "ID not Exist","Invalid ID",0);
           }
         // jLabel_image1.setText(SelectMember.getPhoto());
       } catch (SQLException | NumberFormatException ex) {
           System.getLogger(EditMemberForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
           JOptionPane.showMessageDialog(null, "Enter valid ID","Invalid ID",0);
       }
      
    }//GEN-LAST:event_jButton_SearchActionPerformed

    
   public static void main(String args[]) {
    /* استدعاء الواجهة مباشرة  */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {new EditMemberForm().setVisible(true);}});
      
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JButton jButton_Edit_members;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_selectPhoto;
    private javax.swing.JComboBox<String> jComboBox_Gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_EmptyFname_;
    private javax.swing.JLabel jLabel_Empty_Fname1;
    private javax.swing.JLabel jLabel_Empty_Fname2;
    private javax.swing.JLabel jLabel_Empty_Fname3;
    private javax.swing.JLabel jLabel_Empty_Lname;
    private javax.swing.JLabel jLabel_Empty_Lname1;
    private javax.swing.JLabel jLabel_Empty_Lname2;
    private javax.swing.JLabel jLabel_Empty_Phone;
    private javax.swing.JLabel jLabel_Empty_name2;
    private javax.swing.JLabel jLabel_Photo;
    private javax.swing.JLabel jLabel_Photo1;
    private javax.swing.JLabel jLabel_image1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Authors;
    private javax.swing.JTextArea jTextArea_about;
    private javax.swing.JTextField jTextField_AboutAuthors;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_First_NAME;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Last_NAME;
    private javax.swing.JTextField jTextField_NAME2;
    private javax.swing.JTextField jTextField_Phone;
    // End of variables declaration//GEN-END:variables
}