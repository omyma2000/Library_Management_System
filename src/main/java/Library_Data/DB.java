
package Library_Data;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omayma
 */
public class DB {
    // 1. إنشاء متغير ثابت (static) ليحمل النسخة الوحيدة من الاتصال
    // Singleon pattern 
    private static Connection connection = null;

    // connection variables
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName = "java_library_system";
    private static Integer portNumber = 3306;
    private static String pass = ""; 

    // 2. كونسلتركتور مخفي (private constructor) لمنع عمل new DB() من الخارج
     // Singleon pattern 
    private DB() {}

    // 3. الدالة التي ترجع النسخة الوحيدة
     // Singleon pattern 
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
}
