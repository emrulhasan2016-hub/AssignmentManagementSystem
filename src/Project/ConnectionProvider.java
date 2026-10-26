/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author emrul hasan
 */
public class ConnectionProvider {
    Connection C;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         public static Connection getConnectionProvider()
    {
        try
         {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emrul","root","123456789");
             return con;
         }
         catch(ClassNotFoundException | SQLException e)
         {
             return null;
         }
    }
    
}
