/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Library_Presentation;

import Library_Domain.Book;
import Library_Business.Function_Class;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.interfaces.RSAKey;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;


/**
 *
 * @author omayma
 */
public class DashboardForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DashboardForm.class.getName());
    Border buttonBorder1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
    Border buttonBorder0 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(36,37,42));  
    Library_Business.Function_Class function_Class = new Function_Class();
    Library_Domain.Book book = new Book();
    JLabel[] labels_tab = new JLabel[8];
    /**
     * Creates new form DashboardForm
     */
    public DashboardForm() {
        initComponents();
        //create form.....
        this.setLocationRelativeTo(null);
        // display image in  dashboard left side
        Library_Business.Function_Class func = new Library_Business.Function_Class();
         try {
         java.net.URL imaUrl = getClass().getResource("/My_Images/dashboard_book.png");
             if (imaUrl != null) {
        String cleanPath = java.nio.file.Paths.get(imaUrl.toURI()).toFile().getAbsolutePath();
        
        func.displayImage(106, 107, null, cleanPath,  jLabel_Dashboard_logo);
    }
         } catch (Exception e) {
               e.printStackTrace();
                   }
        // add borderto the panel Header                                      
        Border panelHeaderBorder = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white);
        jPanel_Header.setBorder(panelHeaderBorder);
        // add more borders                                                                الرقم3 سمك الحد بين البوردر و الرأس 
        Border panelHeader_1_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(235,125,22)); //التباين بين الرأس و البوردر كأنه ظل 
        jPanel_1_header.setBorder(panelHeader_1_Border);
        Border panelHeader_2_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(26,138,32));
        jPanel_2_header.setBorder(panelHeader_2_Border);
        Border panelHeader_3_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(115,40,125));
        jPanel_3_header.setBorder(panelHeader_3_Border);
        Border panelHeader_4_Border = BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(115,40,125));
        jPanel_4_header4.setBorder(panelHeader_4_Border);
               // add borders to  button
               addBorders();
               // hover effect 
               buttonsHoverEffect();
               displayCount();
               //display latest 8 books
               // =====================
               // add jlabels to labels_tab
                labels_tab[0] = jLabel_image1_;
                labels_tab[1] = jLabel_image2_;
                labels_tab[2] = jLabel_image3_;
                labels_tab[3] = jLabel_image4_;
                labels_tab[4] = jLabel_image5_;
                labels_tab[5] = jLabel_image6_;
                labels_tab[6] = jLabel_image7_;
                labels_tab[7] = jLabel_image8_;
               // display images 
               book.displayBooksCover(labels_tab);
               
    }

    public void addBorders()
    {
    // get all components in the panel menu
        Component[] comps = jPanel_Menu.getComponents();
        for (Component comp : comps) {
            
            if(comp instanceof JButton){
            JButton button = (JButton) comp;
            // add border
            button.setBorder(buttonBorder0);
    }
    }
    }
      // create a unction to add ahover effect on the menu buttouns 
    public void buttonsHoverEffect(){
        // get all components in the panel menu
        Component[] comps = jPanel_Menu.getComponents();
        for (Component comp : comps) {
            // check if the component is a button 
            if(comp instanceof JButton){
            JButton button = (JButton) comp;
            // add action we want to the button
            button.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent evt)
            {
            button.setBorder(buttonBorder1);
            }
            @Override
            public void mouseExited(MouseEvent evt)
            {
            button.setBorder(buttonBorder0);
            }
            
            });
            }
        }
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel_Menu = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Dashboard_logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton_ManageAuthor = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton_ManageGenre = new javax.swing.JButton();
        jButton_Edit_BOOK_ = new javax.swing.JButton();
        jButton_EditMember_ = new javax.swing.JButton();
        jButton_DeleteMember_ = new javax.swing.JButton();
        jButton_Members_List_ = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton_AddMember_1 = new javax.swing.JButton();
        jButton_Add_BOOK_ = new javax.swing.JButton();
        jButton_Delete_BOOK_ = new javax.swing.JButton();
        jButton_BOOK_LIST = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton_Return = new javax.swing.JButton();
        jButton_Issue = new javax.swing.JButton();
        jPanel_2 = new javax.swing.JPanel();
        jPanel_2_header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_MembersCount = new javax.swing.JLabel();
        jPanel_1 = new javax.swing.JPanel();
        jPanel_1_header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_BooksCount = new javax.swing.JLabel();
        jPanel_3 = new javax.swing.JPanel();
        jPanel_3_header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_AuthorsCount = new javax.swing.JLabel();
        jPanel_4 = new javax.swing.JPanel();
        jPanel_4_header4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_image3_ = new javax.swing.JLabel();
        jLabel_image1_ = new javax.swing.JLabel();
        jLabel_image4_ = new javax.swing.JLabel();
        jLabel_image5_ = new javax.swing.JLabel();
        jLabel_image6_ = new javax.swing.JLabel();
        jLabel_image7_ = new javax.swing.JLabel();
        jLabel_image8_ = new javax.swing.JLabel();
        jLabel_image2_ = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("____________");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("____________");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("____________");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Add a New Book");
        jButton12.setContentAreaFilled(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.addActionListener(this::jButton12ActionPerformed);

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Add a New Book");
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(this::jButton10ActionPerformed);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add a New Book");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Books");

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Add a New Book");
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(this::jButton8ActionPerformed);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(850, 680));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Menu.setBackground(new java.awt.Color(36, 37, 42));

        jPanel_Header.setBackground(new java.awt.Color(1, 50, 67));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("المكتبة ");

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Dashboard_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Dashboard_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("عمليات");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("الصنف");

        jButton_ManageAuthor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_ManageAuthor.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ManageAuthor.setText("إدارة المؤلفين");
        jButton_ManageAuthor.setContentAreaFilled(false);
        jButton_ManageAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ManageAuthor.addActionListener(this::jButton_ManageAuthorActionPerformed);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("المؤلفون");

        jButton_ManageGenre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_ManageGenre.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ManageGenre.setText("إدارة اصناف الكتب ");
        jButton_ManageGenre.setContentAreaFilled(false);
        jButton_ManageGenre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ManageGenre.addActionListener(this::jButton_ManageGenreActionPerformed);

        jButton_Edit_BOOK_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Edit_BOOK_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_BOOK_.setText("تعديل");
        jButton_Edit_BOOK_.setContentAreaFilled(false);
        jButton_Edit_BOOK_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_BOOK_.addActionListener(this::jButton_Edit_BOOK_ActionPerformed);

        jButton_EditMember_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_EditMember_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EditMember_.setText("تعديل");
        jButton_EditMember_.setContentAreaFilled(false);
        jButton_EditMember_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_EditMember_.addActionListener(this::jButton_EditMember_ActionPerformed);

        jButton_DeleteMember_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_DeleteMember_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DeleteMember_.setText("حذف");
        jButton_DeleteMember_.setContentAreaFilled(false);
        jButton_DeleteMember_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_DeleteMember_.addActionListener(this::jButton_DeleteMember_ActionPerformed);

        jButton_Members_List_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Members_List_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Members_List_.setText("قائمة الاعضاء");
        jButton_Members_List_.setContentAreaFilled(false);
        jButton_Members_List_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Members_List_.addActionListener(this::jButton_Members_List_ActionPerformed);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("اعضاء");

        jButton_AddMember_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_AddMember_1.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AddMember_1.setText("اضافة");
        jButton_AddMember_1.setContentAreaFilled(false);
        jButton_AddMember_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AddMember_1.addActionListener(this::jButton_AddMember_1ActionPerformed);

        jButton_Add_BOOK_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Add_BOOK_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_BOOK_.setText("اضافة");
        jButton_Add_BOOK_.setContentAreaFilled(false);
        jButton_Add_BOOK_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_BOOK_.addActionListener(this::jButton_Add_BOOK_ActionPerformed);

        jButton_Delete_BOOK_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Delete_BOOK_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Delete_BOOK_.setText("حذف");
        jButton_Delete_BOOK_.setContentAreaFilled(false);
        jButton_Delete_BOOK_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Delete_BOOK_.addActionListener(this::jButton_Delete_BOOK_ActionPerformed);

        jButton_BOOK_LIST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_BOOK_LIST.setForeground(new java.awt.Color(255, 255, 255));
        jButton_BOOK_LIST.setText("قائمة الكتب");
        jButton_BOOK_LIST.setContentAreaFilled(false);
        jButton_BOOK_LIST.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_BOOK_LIST.addActionListener(this::jButton_BOOK_LISTActionPerformed);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("كتب");

        jButton_Return.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Return.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Return.setText("ارجاع");
        jButton_Return.setContentAreaFilled(false);
        jButton_Return.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Return.addActionListener(this::jButton_ReturnActionPerformed);

        jButton_Issue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Issue.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Issue.setText("استعارة");
        jButton_Issue.setContentAreaFilled(false);
        jButton_Issue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Issue.addActionListener(this::jButton_IssueActionPerformed);

        javax.swing.GroupLayout jPanel_MenuLayout = new javax.swing.GroupLayout(jPanel_Menu);
        jPanel_Menu.setLayout(jPanel_MenuLayout);
        jPanel_MenuLayout.setHorizontalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_ManageGenre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_ManageAuthor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Edit_BOOK_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Add_BOOK_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Issue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_DeleteMember_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_EditMember_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_AddMember_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Members_List_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_BOOK_LIST, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Delete_BOOK_, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel_MenuLayout.setVerticalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_ManageGenre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_ManageAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_AddMember_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_EditMember_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_DeleteMember_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Members_List_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Add_BOOK_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Edit_BOOK_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Delete_BOOK_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_BOOK_LIST)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Issue, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Return, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_2.setBackground(new java.awt.Color(75, 192, 18));

        jPanel_2_header.setBackground(new java.awt.Color(65, 160, 10));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("عدد الاعضاء ");

        javax.swing.GroupLayout jPanel_2_headerLayout = new javax.swing.GroupLayout(jPanel_2_header);
        jPanel_2_header.setLayout(jPanel_2_headerLayout);
        jPanel_2_headerLayout.setHorizontalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_2_headerLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_2_headerLayout.setVerticalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jLabel_MembersCount.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel_MembersCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MembersCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MembersCount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_2Layout = new javax.swing.GroupLayout(jPanel_2);
        jPanel_2.setLayout(jPanel_2Layout);
        jPanel_2Layout.setHorizontalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_2_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_MembersCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_2Layout.setVerticalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2Layout.createSequentialGroup()
                .addComponent(jPanel_2_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel_MembersCount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel_1.setBackground(new java.awt.Color(255, 178, 41));

        jPanel_1_header.setBackground(new java.awt.Color(246, 145, 16));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("عدد الكتب ");

        javax.swing.GroupLayout jPanel_1_headerLayout = new javax.swing.GroupLayout(jPanel_1_header);
        jPanel_1_header.setLayout(jPanel_1_headerLayout);
        jPanel_1_headerLayout.setHorizontalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_1_headerLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_1_headerLayout.setVerticalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jLabel_BooksCount.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel_BooksCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_BooksCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BooksCount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_1Layout = new javax.swing.GroupLayout(jPanel_1);
        jPanel_1.setLayout(jPanel_1Layout);
        jPanel_1Layout.setHorizontalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_BooksCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel_1_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_1Layout.setVerticalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addComponent(jPanel_1_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel_BooksCount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel_3.setBackground(new java.awt.Color(155, 89, 182));

        jPanel_3_header.setBackground(new java.awt.Color(125, 60, 155));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("عدد المؤلفون");

        javax.swing.GroupLayout jPanel_3_headerLayout = new javax.swing.GroupLayout(jPanel_3_header);
        jPanel_3_header.setLayout(jPanel_3_headerLayout);
        jPanel_3_headerLayout.setHorizontalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_3_headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel_3_headerLayout.setVerticalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        jLabel_AuthorsCount.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel_AuthorsCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AuthorsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AuthorsCount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_3Layout = new javax.swing.GroupLayout(jPanel_3);
        jPanel_3.setLayout(jPanel_3Layout);
        jPanel_3Layout.setHorizontalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_3_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addComponent(jLabel_AuthorsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_3Layout.setVerticalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addComponent(jPanel_3_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_AuthorsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jPanel_4.setBackground(new java.awt.Color(102, 102, 255));

        jPanel_4_header4.setBackground(new java.awt.Color(19, 11, 140));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("اخر كتب تمت إضافتها ");

        javax.swing.GroupLayout jPanel_4_header4Layout = new javax.swing.GroupLayout(jPanel_4_header4);
        jPanel_4_header4.setLayout(jPanel_4_header4Layout);
        jPanel_4_header4Layout.setHorizontalGroup(
            jPanel_4_header4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_4_header4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );
        jPanel_4_header4Layout.setVerticalGroup(
            jPanel_4_header4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_header4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_4Layout = new javax.swing.GroupLayout(jPanel_4);
        jPanel_4.setLayout(jPanel_4Layout);
        jPanel_4Layout.setHorizontalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_4_header4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_4Layout.createSequentialGroup()
                        .addComponent(jLabel_image5_, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_image6_, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_4Layout.createSequentialGroup()
                        .addComponent(jLabel_image1_, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_image2_, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_image7_, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_image3_, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_image8_, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_image4_, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel_4Layout.setVerticalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addComponent(jPanel_4_header4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_image1_, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_image3_, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_image4_, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_image2_, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_4Layout.createSequentialGroup()
                        .addGroup(jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_image6_, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_image7_, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_4Layout.createSequentialGroup()
                        .addComponent(jLabel_image8_, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel_4Layout.createSequentialGroup()
                        .addComponent(jLabel_image5_, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLabel6.setBackground(new java.awt.Color(255, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("x");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(0, 51, 204));
        jButton5.setText("_");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton_ManageAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManageAuthorActionPerformed
       // show the Manage Author form 
        ManageAuthorsForm mnAuthorForm = new ManageAuthorsForm();
        mnAuthorForm.setVisible(true);
    }//GEN-LAST:event_jButton_ManageAuthorActionPerformed

    private void jButton_ManageGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManageGenreActionPerformed
        
        // show the Manage Genre form 
        ManageGenresForm mnGenresForm = new ManageGenresForm();
        mnGenresForm.setVisible(true);
    }//GEN-LAST:event_jButton_ManageGenreActionPerformed

    private void jButton_Edit_BOOK_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_BOOK_ActionPerformed
         // show the add Member form 
        EditBookForm1 editBookForm1 = new EditBookForm1();
        editBookForm1.setVisible(true);
    }//GEN-LAST:event_jButton_Edit_BOOK_ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton_EditMember_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EditMember_ActionPerformed
        // TODO add your handling code here:
         // show the edit Member form 
        EditMemberForm editMemberFormForm = new EditMemberForm();
        editMemberFormForm.setVisible(true);
    }//GEN-LAST:event_jButton_EditMember_ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton_DeleteMember_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteMember_ActionPerformed
        // show the delete Member form 
        DeleteMemberForm1 deleteMemberFormForm = new DeleteMemberForm1();
        deleteMemberFormForm.setVisible(true);
    }//GEN-LAST:event_jButton_DeleteMember_ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton_Members_List_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Members_List_ActionPerformed
         // show the  Member List form 
        Member_List_info member_List_info = new Member_List_info();
        member_List_info.setVisible(true);
    }//GEN-LAST:event_jButton_Members_List_ActionPerformed

    private void jButton_AddMember_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddMember_1ActionPerformed
        // TODO add your handling code here:
       AddMemberForm amf = new AddMemberForm();
       amf.setVisible(true);
    }//GEN-LAST:event_jButton_AddMember_1ActionPerformed

    private void jButton_Add_BOOK_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_BOOK_ActionPerformed
        // TODO add your handling code here:
         AddBookForm abf = new AddBookForm();
        abf.setVisible(true);
    }//GEN-LAST:event_jButton_Add_BOOK_ActionPerformed

    private void jButton_Delete_BOOK_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_BOOK_ActionPerformed
        // TODO add your handling code here:
        DeleteBookForm1 deleteBookForm1 = new DeleteBookForm1();
        deleteBookForm1.setVisible(true);
    }//GEN-LAST:event_jButton_Delete_BOOK_ActionPerformed

    private void jButton_BOOK_LISTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BOOK_LISTActionPerformed
        // TODO add your handling code here:
        Book_List_info1 book_List_info1 = new Book_List_info1();
        book_List_info1.setVisible(true);
    }//GEN-LAST:event_jButton_BOOK_LISTActionPerformed

    private void jButton_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReturnActionPerformed
        ReturnBookForm11 returnBookForm11 = new ReturnBookForm11();
        returnBookForm11.setVisible(true);
    }//GEN-LAST:event_jButton_ReturnActionPerformed

    private void jButton_IssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IssueActionPerformed
        IssueBookForm1 issueBookForm1 = new IssueBookForm1();
        issueBookForm1.setVisible(true);
    }//GEN-LAST:event_jButton_IssueActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        //close form
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setState(javax.swing.JFrame.ICONIFIED);
    }//GEN-LAST:event_jButton5ActionPerformed
//==============================================================================
    public void displayCount(){
      
          
           jLabel_BooksCount.setText(String.valueOf(function_Class.countData("books")));
           jLabel_MembersCount.setText(String.valueOf(function_Class.countData("members")));
           jLabel_AuthorsCount.setText(String.valueOf(function_Class.countData("author")));
        } 
         
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new DashboardForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton_AddMember_1;
    private javax.swing.JButton jButton_Add_BOOK_;
    private javax.swing.JButton jButton_BOOK_LIST;
    private javax.swing.JButton jButton_DeleteMember_;
    private javax.swing.JButton jButton_Delete_BOOK_;
    private javax.swing.JButton jButton_EditMember_;
    private javax.swing.JButton jButton_Edit_BOOK_;
    private javax.swing.JButton jButton_Issue;
    private javax.swing.JButton jButton_ManageAuthor;
    private javax.swing.JButton jButton_ManageGenre;
    private javax.swing.JButton jButton_Members_List_;
    private javax.swing.JButton jButton_Return;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_AuthorsCount;
    private javax.swing.JLabel jLabel_BooksCount;
    private javax.swing.JLabel jLabel_Dashboard_logo;
    private javax.swing.JLabel jLabel_MembersCount;
    private javax.swing.JLabel jLabel_image1_;
    private javax.swing.JLabel jLabel_image2_;
    private javax.swing.JLabel jLabel_image3_;
    private javax.swing.JLabel jLabel_image4_;
    private javax.swing.JLabel jLabel_image5_;
    private javax.swing.JLabel jLabel_image6_;
    private javax.swing.JLabel jLabel_image7_;
    private javax.swing.JLabel jLabel_image8_;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_1_header;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_2_header;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_3_header;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_4_header4;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_Menu;
    // End of variables declaration//GEN-END:variables
}
