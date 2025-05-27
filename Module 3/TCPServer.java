import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started, waiting for client...");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Received from client: " + line);
            out.println("Echo: " + line);
        }

        socket.close();
        serverSocket.close();
    }
}
