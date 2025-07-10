import java.io.*;
import java.net.*;
public class UDPChatServer {
public static void main(String[] args) {
try {
DatagramSocket serverSocket = new
DatagramSocket(12345);
System.out.println("UDP Server running...");
byte[] receiveData = new byte[1024];
byte[] sendData = new byte[1024];
DatagramPacket receivePacket = new
DatagramPacket(receiveData, receiveData.length);
while (true) {
serverSocket.receive(receivePacket);
String receivedMessage = new
String(receivePacket.getData(), 0, receivePacket.getLength());
System.out.println("Client: " +
receivedMessage);
BufferedReader consoleInput = new
BufferedReader(new InputStreamReader(System.in));
String messageToSend =
consoleInput.readLine();
sendData = messageToSend.getBytes();
DatagramPacket sendPacket = new
DatagramPacket(sendData, sendData.length,
receivePacket.getAddress(), receivePacket.getPort());
serverSocket.send(sendPacket);
}
} catch (IOException e) {
e.printStackTrace();
}
}
}