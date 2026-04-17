
// ============================================================
// EXPERIMENT-13: UDP Echo Client and Echo Server
// ============================================================



// --- File: EchoClient.java ---
import java.net.*;
import java.io.*;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] buffer = new byte[1024];

        InetAddress serverAddress = InetAddress.getByName("localhost");

        String message = "From Client - Hello Server";
        byte[] sendData = message.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 8888);
        socket.send(sendPacket);
        System.out.println("Sent: " + message);
        System.out.println("End of sending");

        DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
        socket.receive(receivePacket);

        String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Received: " + response);
        System.out.println("End of programming");

        socket.close();
    }
}