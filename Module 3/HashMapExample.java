import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Add student records (ID and Name). Type -1 to stop.");

        while (true) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            if (id == -1) break;
            sc.nextLine(); // consume newline
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("No student found with ID " + searchId);
        }
        sc.close();
    }
}
