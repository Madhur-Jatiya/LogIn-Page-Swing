package swing;
import java.sql.*;

public class MysqlConnection {

    private final String URL = "jdbc:mysql://localhost:3306/information";
    private final String USERNAME = "root";
    private final String PASSWORD = "My$ql123";
        
    public Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        
        System.out.println("Connecting to Database...");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("Connection Successfully");
        
        return connection;
    }
            
}
