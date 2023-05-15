package DatabaseProgramming;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB09 {
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
            String sql = "INSERT INTO student (studentID, firstName, lastName, email, deptID) VALUES ('65130500020', 'Nathaphat'" +
                    ", 'Lertsiriphongphan', 'nathaphat.n07@gmail.com', 'IT')";
            statement.executeQuery(sql);
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LAB09.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}