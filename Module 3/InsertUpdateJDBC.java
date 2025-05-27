import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertUpdateJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/yourdatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void insertStudent(int id, String name) {
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
            System.out.println("Student inserted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateStudentName(int id, String newName) {
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newName);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Student updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        insertStudent(1, "Alice");
        updateStudentName(1, "Alicia");
    }
}
