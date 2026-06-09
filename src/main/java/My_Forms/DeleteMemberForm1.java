package My_Forms;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author omayma
 */

public class DeleteMemberForm1 extends javax.swing.JFrame {
    
   private static final java.util.logging.Logger logger =java.util.logging.Logger.getLogger(DeleteMemberForm1.class.getName());
    /**
     * Creates new form ManageGenresForm
     */
   // member object 
    My_Classes.Member member = new My_Classes.Member();
    
   
    public DeleteMemberForm1() {
        initComponents();
        // center form
        this.setLocationRelativeTo(null);
        
        // add borderto the panel Header                                      
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 5, 3, new Color(1,152,117));
        jPanel1.setBorder(panelHeaderBorder);
        
        //display image 
        My_Classes.Function_Class func = new My_Classes.Function_Class();
        func.displayImage(90, 60, null ,"/My_Images/Add_members.png", jLabel1);
        jLabel_Empty_Delete_Member.setForeground(Color.white);
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
        jLabel_Empty_Fname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Last_NAME = new javax.swing.JTextField();
        jLabel_Empty_name2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel_Empty_Phone = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox_Gender = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel_Photo = new javax.swing.JLabel();
        jButton_selectPhoto = new javax.swing.JButton();
        jLabel_Empty_Fname2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_ID_Del = new javax.swing.JTextField();
        jButton_Delete_member = new javax.swing.JButton();
        jLabel_Empty_Delete_Member = new javax.swing.JLabel();
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

        jLabel_Empty_Fname.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Fname.setText("* Enter the First Name");
        jLabel_Empty_Fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_FnameMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel9.setText("Last Name:");

        jTextField_Last_NAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Last_NAME.addActionListener(this::jTextField_Last_NAMEActionPerformed);

        jLabel_Empty_name2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_name2.setText("* Enter the Last Name");
        jLabel_Empty_name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_name2MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel11.setText("Phone No:");

        jTextField_Phone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Phone.addActionListener(this::jTextField_PhoneActionPerformed);

        jLabel_Empty_Phone.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Phone.setText("* Enter the Phone Number ");
        jLabel_Empty_Phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_PhoneMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel13.setText("Email:");

        jTextField_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Email.addActionListener(this::jTextField_EmailActionPerformed);

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setText("Gender:");

        jComboBox_Gender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setText("Profile Picture:");

        jLabel_Photo.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel_Photo.setForeground(new java.awt.Color(51, 0, 255));
        jLabel_Photo.setText("choose Profile Picture....");

        jButton_selectPhoto.setText("Select Profile Picture:");
        jButton_selectPhoto.addActionListener(this::jButton_selectPhotoActionPerformed);

        jLabel_Empty_Fname2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Fname2.setText("* Enter the ID to Delete ");
        jLabel_Empty_Fname2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_Fname2MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel4.setText("Enter ID:");

        jTextField_ID_Del.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_ID_Del.addActionListener(this::jTextField_ID_DelActionPerformed);

        jButton_Delete_member.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Delete_member.setText("Delete");
        jButton_Delete_member.addActionListener(this::jButton_Delete_memberActionPerformed);

        jLabel_Empty_Delete_Member.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_Empty_Delete_Member.setText("* Enter ID to Delete");
        jLabel_Empty_Delete_Member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_Delete_MemberMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jButton_Delete_member)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Empty_Delete_Member)
                    .addComponent(jTextField_ID_Del, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_ID_Del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Empty_Delete_Member)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton_Delete_member, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(1, 152, 117));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Delete Member");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addGap(18, 18, 18)
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

    private void jTextField_ID_DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ID_DelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ID_DelActionPerformed

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

    private void jButton_Delete_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_memberActionPerformed
         try{
        Integer id = Integer.parseInt(jTextField_ID_Del.getText()) ;
        // show confirmation message before deleting 
        int confirm = JOptionPane.showConfirmDialog(null, "Are You Sure Want To Delete This Member !","confirmation Bow",JOptionPane.YES_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
         member.deleteMember(id);
        }else{
            System.out.println("cancel ");
        }
       
         }
         catch(Exception ex ){
         jLabel_Empty_Delete_Member.setForeground(Color.red);
         }
    }//GEN-LAST:event_jButton_Delete_memberActionPerformed

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
    jTextField_ID_Del.setText(firstName);
    jTextField_Last_NAME.setText(lastName);
    jTextField_Phone.setText(expersite);
    jTextField_AboutAuthors.setText(about);
    
    
    }//GEN-LAST:event_jTable_AuthorsMouseClicked

    private void jLabel_Empty_FnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_FnameMouseClicked
        //hide jlabel on click
        jLabel_Empty_Fname.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_FnameMouseClicked

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
     
    }//GEN-LAST:event_jButton_selectPhotoActionPerformed

    private void jLabel_Empty_Fname2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_Fname2MouseClicked
       
    }//GEN-LAST:event_jLabel_Empty_Fname2MouseClicked

    private void jLabel_Empty_Delete_MemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_Delete_MemberMouseClicked
        //hide jlabel on click
        jLabel_Empty_Fname.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_Empty_Delete_MemberMouseClicked

    
   public static void main(String args[]) {
    /* استدعاء الواجهة مباشرة  */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {new DeleteMemberForm1().setVisible(true);}});
      
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Delete_member;
    private javax.swing.JButton jButton_Edit;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Empty_Delete_Member;
    private javax.swing.JLabel jLabel_Empty_Fname;
    private javax.swing.JLabel jLabel_Empty_Fname1;
    private javax.swing.JLabel jLabel_Empty_Fname2;
    private javax.swing.JLabel jLabel_Empty_Fname3;
    private javax.swing.JLabel jLabel_Empty_Lname;
    private javax.swing.JLabel jLabel_Empty_Lname1;
    private javax.swing.JLabel jLabel_Empty_Lname2;
    private javax.swing.JLabel jLabel_Empty_Phone;
    private javax.swing.JLabel jLabel_Empty_name2;
    private javax.swing.JLabel jLabel_Photo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Authors;
    private javax.swing.JTextArea jTextArea_about;
    private javax.swing.JTextField jTextField_AboutAuthors;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_ID_Del;
    private javax.swing.JTextField jTextField_Last_NAME;
    private javax.swing.JTextField jTextField_NAME2;
    private javax.swing.JTextField jTextField_Phone;
    // End of variables declaration//GEN-END:variables
}