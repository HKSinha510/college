import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnectionDemo {
    public static void main(String[] args) {

        // Database credentials
        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";        // change if needed
        String password = "myseql"; // change if needed

        try {
            // 1. Load driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // 3. Create statement
            Statement stmt = con.createStatement();

            // 4. Insert data
            stmt.executeUpdate("INSERT INTO student VALUES (1, 'Hardik', 'hardik@gmail.com', 20, 'Vidisha')");

            // 5. Retrieve data
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(rs.getInt("ID") + " " + rs.getString("name"));
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}