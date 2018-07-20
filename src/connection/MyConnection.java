
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class MyConnection {
    
    public static Connection getConnection()
    {
        Connection con = null ;
        Statement st;
        String url="jdbc:mysql://localhost:3306/company?verifyServerCertificate=false&useSSL=true";
          String user = "root";
          String pass = "";
          
          try{
              Class.forName("com.mysql.jdbc.Driver");
              con= DriverManager.getConnection(url, user, pass);
              st=con.createStatement();
              
          }catch(Exception ex)
          {
              JOptionPane.showMessageDialog(null, ex);
          }
          
        return con;
    }
    
}
