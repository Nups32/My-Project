import java.net.DatagramPacket;  
import java.net.DatagramSocket;  
import java.net.InetAddress;  
import java.util.Scanner;  

public class UdpClient {  
    public static void main(String[] args) {  
        DatagramSocket socket = null;  

        try {  
            socket = new DatagramSocket();  
            InetAddress serverAddress = InetAddress.getByName("localhost");  
            Scanner scanner = new Scanner(System.in);  

            System.out.print("Enter a mathematical expression : ");  
            String expression = scanner.nextLine();  

            // Send the expression to the server  
            byte[] sendBuffer = expression.getBytes();  
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, 12345);  
            socket.send(sendPacket);  
            System.out.println("Sent expression: " + expression);  

            // Receive the result from the server  
            byte[] receiveBuffer = new byte[1024];  
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);  
            socket.receive(receivePacket);  
            String result = new String(receivePacket.getData(), 0, receivePacket.getLength());  
            System.out.println("Received from server: " + result);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            if (socket != null && !socket.isClosed()) {  
                socket.close();  
            }  
        }  
    }  
}  