import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);

        System.out.println("Connected to server. Type messages:");

        String input;
        while (!(input = sc.nextLine()).equalsIgnoreCase("exit")) {
            out.println(input);
            System.out.println("Server response: " + in.readLine());
        }

        socket.close();
        sc.close();
    }
}
