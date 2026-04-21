import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HelloWorld {

    public static void main(String[] args) {

        String userInput = "admin' OR '1'='1"; // simulated attacker input

        try {
            // Hardcoded credentials (SECURITY ISSUE)
            String url = "jdbc:mysql://localhost:3306/testdb";
            String username = "root";
            String password = "12345";

            Connection conn = DriverManager.getConnection(url, username, password);

            Statement stmt = conn.createStatement();

            // SQL Injection vulnerability
            String query = "SELECT * FROM users WHERE username = '" + userInput + "'";
            stmt.executeQuery(query);

            System.out.println("Query executed");

            // Sensitive info exposure
            System.out.println("DB Password: " + password);

            // Weak random number (predictable)
            int random = (int)(Math.random() * 10);
            System.out.println("Random: " + random);

            // Null pointer risk
            String text = null;
            System.out.println(text.length());

        } catch (Exception e) {
            // Bad practice: printing stack trace (information leakage)
            e.printStackTrace();
        }
    }
}
