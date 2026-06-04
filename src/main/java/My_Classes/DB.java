/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package My_Classes;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;


/**
 *
 * @author LCS
 */
public class DB {
    // connectios
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName= "java_library_system";
    private static Integer portNumber = 3306 ;
    private static String pass =""; // no password
    // function to (create & retrun ) connection .
    public static Connection getConnection (){
       Connection connection = null;
       MysqlDataSource dataSource = new MysqlDataSource();
       dataSource.setServerName(serverName);
       dataSource.setUser(userName);
       dataSource.setDatabaseName(dbName);
       dataSource.setPortNumber(portNumber);
       dataSource.setPassword(pass);
       return connection;
    }
    }

