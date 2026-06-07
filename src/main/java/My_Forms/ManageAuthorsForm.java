package My_Forms;
import My_Classes.Authors;
import My_Forms.DashboardForm;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omayma
 */

public class ManageAuthorsForm extends javax.swing.JFrame {
    
   private static final java.util.logging.Logger logger =java.util.logging.Logger.getLogger(ManageAuthorsForm.class.getName());
    /**
     * Creates new form ManageGenresForm
     */
    My_Classes.Authors authors = new My_Classes.Authors();
    public ManageAuthorsForm() {
        initComponents();
        // center form
        this.setLocationRelativeTo(null);
        
        // add borderto the panel Header                                      
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 5, 3, new Color(1,50,67));
        jPanel1.setBorder(panelHeaderBorder);
        
        //display image 
        My_Classes.Function_Class func = new My_Classes.Function_Class();
        func.displayImage(75, 60, null,"/My_Images/author.png", jLabel1);
        // customize table 
        func.customizeTable(jTable_Authors);
       // customize Header table 
       func.customizeHeaderTable(jTable_Authors, new Color(34,167,240), 16);
        // to hide thered sentence 
       jLabel_Empty_Fname.setVisible(false);
       jLabel_Empty_Lname.setVisible(false);
      // populat Jtable with Authors
      populatJtablewithAuthors();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField_NAME2 = new javax.swing.JTextField();
        jTextField_AboutAuthors = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_F_NAME = new javax.swing.JTextField();
        jButton_Edit = new javax.swing.JButton();
        jButton_Add = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Authors = new javax.swing.JTable();
        jLabel_Empty_Fname = new javax.swing.JLabel();
        jTextField_L_NAME = new javax.swing.JTextField();
        jLabel_Empty_Lname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Expertise = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_about = new javax.swing.JTextArea();

        jLabel3.setText("jLabel3");

        jTextField_NAME2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_NAME2.addActionListener(this::jTextField_NAME2ActionPerformed);

        jTextField_AboutAuthors.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_AboutAuthors.addActionListener(this::jTextField_AboutAuthorsActionPerformed);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(231, 230, 230));

        jLabel1.setBackground(new java.awt.Color(1, 50, 67));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("   Manage  Authrs");
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

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("First Name");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("ID:");

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_ID.addActionListener(this::jTextField_IDActionPerformed);

        jTextField_F_NAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_F_NAME.addActionListener(this::jTextField_F_NAMEActionPerformed);

        jButton_Edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit.setText("Edit");
        jButton_Edit.addActionListener(this::jButton_EditActionPerformed);

        jButton_Add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add.setText("Add");
        jButton_Add.addActionListener(this::jButton_AddActionPerformed);

        jButton_Delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(this::jButton_DeleteActionPerformed);

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

        jLabel_Empty_Fname.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Fname.setText("* Enter the First Name");
        jLabel_Empty_Fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_FnameMouseClicked(evt);
            }
        });

        jTextField_L_NAME.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_L_NAME.addActionListener(this::jTextField_L_NAMEActionPerformed);

        jLabel_Empty_Lname.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Empty_Lname.setText("* Enter the Last Name");
        jLabel_Empty_Lname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Empty_LnameMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setText("Last Name:");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setText("About : ");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setText("Expertise");

        jTextField_Expertise.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Expertise.addActionListener(this::jTextField_ExpertiseActionPerformed);

        jTextArea_about.setColumns(20);
        jTextArea_about.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextArea_about.setRows(5);
        jScrollPane2.setViewportView(jTextArea_about);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField_Expertise, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_L_NAME, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Empty_Fname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Empty_Lname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_F_NAME, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Add, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addComponent(jScrollPane1))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_F_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Empty_Fname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_L_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Empty_Lname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add)
                            .addComponent(jButton_Edit)
                            .addComponent(jButton_Delete))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        //close form
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField_F_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_F_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_F_NAMEActionPerformed

    private void jButton_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditActionPerformed
           //edit  author
        
        String fname = jTextField_F_NAME.getText(); 
        String Lname = jTextField_L_NAME.getText(); 
        String expertise = jTextField_Expertise.getText(); 
        String about = jTextField_AboutAuthors.getText(); 
        if(fname.isEmpty()){
        System.out.println("First name is Emoty Value!");
        jLabel_Empty_Fname.setVisible(true);
        }else if (Lname.isEmpty()){
          System.out.println("Last name is Emoty Value!");
        jLabel_Empty_Fname.setVisible(true);
         }else
        {
            try{
             int id = Integer.parseInt(jTextField_ID.getText());
             authors.editAuthor(id, fname, Lname, expertise, about);
             
                  //  populat Jtable with Authors
                   populatJtablewithAuthors();
            }
            catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null,"Invalid Author ID: " + ex.getMessage(),"Error",0);
            
            }
            }
        
    }//GEN-LAST:event_jButton_EditActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        // add new Author
        String fname = jTextField_F_NAME.getText();
        String Lname = jTextField_L_NAME.getText();
        String expertise = jTextField_Expertise.getText();
        String about = jTextArea_about.getText();
        // check empty value 
        if(fname.isEmpty()){
  
        System.out.println("Emoty Value!");
        jLabel_Empty_Fname.setVisible(true);
        }
        else if(Lname.isEmpty()){
  
        System.out.println("Emoty Value!");
        jLabel_Empty_Lname.setVisible(true);
        }
        else{
        authors.addAuthor(fname, Lname, expertise, about);
               //refreshing  Jtable  Authors
             populatJtablewithAuthors();
        }
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
          // remove the selected authors
             try{
             int id = Integer.parseInt(jTextField_ID.getText());
             authors.deleteAuthor(id);
                    //populat Jtable with Authors
                      populatJtablewithAuthors();
                       // clear text from text field 
                       jTextField_ID.setText("");
                       jTextField_F_NAME.setText("");
                       jTextField_L_NAME.setText("");
                       jTextField_Expertise.setText("");
                       jTextArea_about.setText("");
            }
            catch(NumberFormatException ex){
               JOptionPane.showMessageDialog(null,"Invalid Author ID: " + ex.getMessage(),"Error",0);
            
            }

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
    jTextField_F_NAME.setText(firstName);
    jTextField_L_NAME.setText(lastName);
    jTextField_Expertise.setText(expersite);
    jTextField_AboutAuthors.setText(about);
    
    
    }//GEN-LAST:event_jTable_AuthorsMouseClicked

    private void jLabel_Empty_FnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Empty_FnameMouseClicked
        //hide jlabel on click
        jLabel_Empty_Fname.setVisible(false);
    }//GEN-LAST:event_jLabel_Empty_FnameMouseClicked

    private void jTextField_L_NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_L_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_L_NAMEActionPerformed

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

    private void jTextField_ExpertiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ExpertiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ExpertiseActionPerformed
// create function to populate the table with Author
   public void populatJtablewithAuthors(){
       ArrayList<My_Classes.Authors> authorsList  = authors.authorsList();
       // jlabel columns
       String[] colNames = {"ID","F-NAME","L-NAME","EXPERSITE","ABOUT"};
       // row 
       Object[][] rows= new Object[authorsList.size()][colNames.length];
       for(int i=0 ;i<authorsList.size();i++){
       
       rows[i][0] = authorsList.get(i).getId();
       rows[i][1] = authorsList.get(i).getFirstName();
       rows[i][2] = authorsList.get(i).getLasttName();
       rows[i][3] = authorsList.get(i).getField_Of_Expertise();
       rows[i][4] = authorsList.get(i).getAbout();
       }
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
       jTable_Authors.setModel(model);
    }
    
 
    
    
   public static void main(String args[]) {
    /* استدعاء الواجهة مباشرة  */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {new ManageAuthorsForm().setVisible(true);}});
      
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Empty_Fname;
    private javax.swing.JLabel jLabel_Empty_Lname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Authors;
    private javax.swing.JTextArea jTextArea_about;
    private javax.swing.JTextField jTextField_AboutAuthors;
    private javax.swing.JTextField jTextField_Expertise;
    private javax.swing.JTextField jTextField_F_NAME;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_L_NAME;
    private javax.swing.JTextField jTextField_NAME2;
    // End of variables declaration//GEN-END:variables
}