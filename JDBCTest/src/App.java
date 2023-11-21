import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Statement s;
            String user = "postgres";
            String password = "postgres";
            String url = "jdbc:postgresql://localhost:5432/postgres";

            Connection c = DriverManager.getConnection(url, user, password);
            s = c.createStatement();
            s.executeQuery("INSERT INTO CONTATO VALUES('1', 'Paiva', 'test@gmail.com')");

            c.close();

        } catch (Exception e) {
            System.out.println("/n" + e);
        }
    }
}
