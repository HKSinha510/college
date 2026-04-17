// --- File: EchoServer.java ---
import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] buffer = new byte[512];

        System.out.println("Echo Server started on port 8888...");

        DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
        socket.receive(receivePacket);

        String received = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Received: " + received);
        System.out.println("End of reception");

        // Echo back the same message
        InetAddress clientAddress = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();

        String response = "From Server - Hello Client";
        byte[] responseData = response.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(responseData, responseData.length, clientAddress, clientPort);
        socket.send(sendPacket);
        System.out.println("Sent: " + response);
        System.out.println("End of sending");

        socket.close();
    }
}