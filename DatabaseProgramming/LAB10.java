package DatabaseProgramming;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LAB10 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection connection= DriverManager.getConnection(URL, username, password);
            System.out.println("Database Connected");
            Statement statement = connection.createStatement();
            String sql = "UPDATE student SET email = 'flokza135@gmail.com' WHERE studentID = '65130500020'";
            statement.executeUpdate(sql);
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LAB10.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
