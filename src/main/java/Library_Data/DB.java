package Library_Data;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashMap;
import java.io.InputStream;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author omayma
 */
public class DB {
    // 1. إنشاء متغير ثابت (static) ليحمل النسخة الوحيدة من الاتصال
    // Singleton pattern 
    private static Connection connection = null;

    // connection variables
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName = "java_library_system";
    private static Integer portNumber = 3306;
    private static String pass = ""; 

    // 2. كونسلتراكتور مخفي (private constructor) لمنع عمل new DB() من الخارج
    // Singleton pattern 
    private DB() {}

    // 3. الدالة التي ترجع النسخة الوحيدة
    // Singleton pattern 
    public static Connection getConnection() {
        // إذا كان الاتصال لم ينشأ بعد أو تم إغلاقه، نقوم بإنشائه لأول مرة فقط
        try {
            if (connection == null || connection.isClosed()) {
                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setServerName(serverName);
                dataSource.setUser(userName);
                dataSource.setDatabaseName(dbName);
                dataSource.setPortNumber(portNumber);
                dataSource.setPassword(pass);

                connection = dataSource.getConnection();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection; // إرجاع نفس النسخة دائماً
    }

    /**
     * دالة ثابتة ومجهزة لعرض أي تقرير بمجرد تمرير اسمه
     * @param reportName اسم ملف التقرير مع الامتداد مثل "/books_report.jasper"
     */
    public static void showReport(String reportName) {
        try {
            // 1. قراءة الملف من الـ resources
            InputStream reportStream = DB.class.getResourceAsStream(reportName);
            
            if (reportStream == null) {
                JOptionPane.showMessageDialog(null, "لم يتم العثور على ملف التقرير: " + reportName);
                return;
            }

            // 2. تجهيز الباراميترز (فارغة)
            HashMap<String, Object> parameters = new HashMap<>();
            
            // 3. تعبئة التقرير بالبيانات باستخدام الاتصال الحالي
            JasperPrint jasperPrint = JasperFillManager.fillReport(reportStream, parameters, getConnection());

            // 4. عرض التقرير في نافذة مستقلة
            JasperViewer viewer = new JasperViewer(jasperPrint, false);
            viewer.setTitle("عرض التقرير");
            viewer.setVisible(true);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "خطأ أثناء تشغيل التقرير: " + e.getMessage());
        }
    }
}