import java.io.*;
import java.net.*;
public class UDPChatClient {
public static void main(String[] args) {
try {
DatagramSocket clientSocket = new
DatagramSocket();
InetAddress IPAddress =
InetAddress.getByName("localhost");
BufferedReader consoleInput = new
BufferedReader(new InputStreamReader(System.in));
byte[] sendData;
byte[] receiveData = new byte[1024];
while (true) {
String messageToSend =
consoleInput.readLine();
sendData = messageToSend.getBytes();
DatagramPacket sendPacket = new
DatagramPacket(sendData, sendData.length, IPAddress, 12345);
clientSocket.send(sendPacket);
DatagramPacket receivePacket = new
DatagramPacket(receiveData, receiveData.length);
clientSocket.receive(receivePacket);
String receivedMessage = new
String(receivePacket.getData(), 0, receivePacket.getLength());
System.out.println("Server: " +
receivedMessage);
}
} catch (IOException e) {
e.printStackTrace();
}
}
}