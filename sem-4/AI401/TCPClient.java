
// ============================================================
// EXPERIMENT-14: Client-Server Communication Using TCP
// ============================================================



// --- File: TCPClient.java ---
import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to server.");

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter message to send: ");
            String message = userInput.readLine();
            out.println(message);
            System.out.println("Sent: " + message);

            String response = in.readLine();
            System.out.println("Received from server: " + response);

            in.close();
            out.close();
            socket.close();

        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}