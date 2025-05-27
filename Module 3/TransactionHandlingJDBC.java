import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionHandlingJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/yourdatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void transferMoney(int fromAccountId, int toAccountId, double amount) {
        String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            conn.setAutoCommit(false);

            try (PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSQL)) {

                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAccountId);
                debitStmt.executeUpdate();

                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAccountId);
                creditStmt.executeUpdate();

                conn.commit();
                System.out.println("Transaction successful.");
            } catch (Exception e) {
                conn.rollback();
                System.out.println("Transaction failed. Rolled back.");
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        transferMoney(1, 2, 100.0);
    }
}
