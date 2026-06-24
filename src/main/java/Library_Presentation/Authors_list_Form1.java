package Library_Presentation;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author omayma
 */

public class Authors_list_Form1 extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(Authors_list_Form1.class.getName());

    private AddBookForm addBookForm;
    private EditBookForm1 editBookForm1;

    public void setAddBookForm(AddBookForm form) {
        this.addBookForm = form;
    }

    public void setEditBookForm(EditBookForm1 form) {
        this.editBookForm1 = form;
    }

    Library_Domain.Authors authors = new Library_Domain.Authors();

    public static String formType = " ";

    public Authors_list_Form1() {
        initComponents();

        // center form
        this.setLocationRelativeTo(null);

        // add border to the panel Header
        Border panelHeaderBorder =
                BorderFactory.createMatteBorder(3, 3, 5, 3, new Color(1,50,67));
        jPanel1.setBorder(panelHeaderBorder);

        // display image
        Library_Business.Function_Class func = new Library_Business.Function_Class();
 try {
         java.net.URL imaUrl = getClass().getResource("/My_Images/author.png");
             if (imaUrl != null) {
        String cleanPath = java.nio.file.Paths.get(imaUrl.toURI()).toFile().getAbsolutePath();
        
        func.displayImage(75, 60, null, cleanPath,  jLabel1);
    }
         } catch (Exception e) {
               e.printStackTrace();
                   }
        Library_Business.BaseUI_Service buis = new Library_Business.BaseUI_Service();
        // customize table
        buis.customizeTable(jTable_Authors,new Color(34,50,67),Color.white);


        populatJtablewithAuthors();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField_NAME2 = new javax.swing.JTextField();
        jTextField_AboutAuthors = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Authors = new javax.swing.JTable();
        jButton_select_Author_ = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jTextField_NAME2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_NAME2.addActionListener(this::jTextField_NAME2ActionPerformed);

        jTextField_AboutAuthors.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_AboutAuthors.addActionListener(this::jTextField_AboutAuthorsActionPerformed);

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setText("Last Name:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(231, 230, 230));

        jLabel1.setBackground(new java.awt.Color(1, 50, 67));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("     Authrs List ");
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

        jButton_select_Author_.setText("Select Author");
        jButton_select_Author_.addActionListener(this::jButton_select_Author_ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_select_Author_, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_select_Author_)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        //close form
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTable_AuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AuthorsMouseClicked

  
    int index = jTable_Authors.getSelectedRow();

    if(index != -1) {
      jTable_Authors.setRowSelectionInterval(index, index);
    

}
    
    }//GEN-LAST:event_jTable_AuthorsMouseClicked

    private void jTextField_NAME2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NAME2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NAME2ActionPerformed

    private void jTextField_AboutAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AboutAuthorsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AboutAuthorsActionPerformed

    private void jButton_select_Author_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_select_Author_ActionPerformed

    int index = jTable_Authors.getSelectedRow();

    if(index == -1) {
        JOptionPane.showMessageDialog(null, "Select an author");
        return;
    }

    int id = Integer.parseInt(jTable_Authors.getValueAt(index, 0).toString());
    String firstName = jTable_Authors.getValueAt(index, 1).toString();
    String lastName = jTable_Authors.getValueAt(index, 2).toString();

    String fullname = firstName + " " + lastName;

    if(editBookForm1 != null){
        editBookForm1.displayAuthorData(id, fullname);
    }

    if(addBookForm != null){
        addBookForm.displayAuthorData(id, fullname);
    }

    dispose();

   
    }//GEN-LAST:event_jButton_select_Author_ActionPerformed
// create function to populate the table with Author
   public void populatJtablewithAuthors(){
       ArrayList<Library_Domain.Authors> authorsList  = authors.authorsList();
       // jlabel columns
       String[] colNames = {"ID","F-NAME","L-NAME","EXPERSITE","ABOUT"};
       // row 
       Object[][] rows= new Object[authorsList.size()][colNames.length];
       for(int i=0 ;i<authorsList.size();i++){
       
       rows[i][0] = authorsList.get(i).getId();
       rows[i][1] = authorsList.get(i).getFirstName();
       rows[i][2] = authorsList.get(i).getLastName();
       rows[i][3] = authorsList.get(i).getField_Of_Expertise();
       rows[i][4] = authorsList.get(i).getAbout();
       }
        DefaultTableModel model = new DefaultTableModel(rows,colNames);
       jTable_Authors.setModel(model);
    }
   
    
 
    
    
   public static void main(String args[]) {
    /* استدعاء الواجهة مباشرة  */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {new Authors_list_Form1().setVisible(true);}});
      
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_select_Author_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_Authors;
    private javax.swing.JTextField jTextField_AboutAuthors;
    private javax.swing.JTextField jTextField_NAME2;
    // End of variables declaration//GEN-END:variables
}