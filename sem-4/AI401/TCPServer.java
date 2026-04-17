// --- File: TCPServer.java ---
import java.net.*;
import java.io.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("TCP Server started. Waiting for client...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected from: " + clientSocket.getInetAddress());

            // Read message from client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            String clientMessage = in.readLine();
            System.out.println("Received from client: " + clientMessage);

            // Send response
            String response = "Welcome from Server!";
            out.println(response);
            System.out.println("Sent to client: " + response);

            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();

        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}