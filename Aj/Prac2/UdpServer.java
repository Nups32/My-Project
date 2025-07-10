import java.net.DatagramPacket;  
import java.net.DatagramSocket;  
import java.net.InetAddress;  

public class UdpServer {  
    public static void main(String[] args) {  
        DatagramSocket socket = null;  

        try {  
            socket = new DatagramSocket(12345);  
            System.out.println("Server is listening on port 12345");  
            
            while (true) {  
                // Buffer to hold incoming data  
                byte[] receiveBuffer = new byte[1024];  
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);  
                
                // Receive the packet from the client  
                socket.receive(receivePacket);  
                String expression = new String(receivePacket.getData(), 0, receivePacket.getLength());  
                System.out.println("Received expression: " + expression);  

                // Evaluate the expression  
                String result = evaluateExpression(expression);  

                // Send the result back to the client  
                InetAddress clientAddress = receivePacket.getAddress();  
                int clientPort = receivePacket.getPort();  
                byte[] sendBuffer = ("Result=" + result).getBytes();  
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, clientAddress, clientPort);  
                socket.send(sendPacket);  
                System.out.println("Sent result: " + result);  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            if (socket != null && !socket.isClosed()) {  
                socket.close();  
            }  
        }  
    }  

    private static String evaluateExpression(String expression) {  
        try {  
            // Use JavaScript engine to evaluate the expression safely  
            return String.valueOf(new javax.script.ScriptEngineManager()  
                    .getEngineByName("JavaScript").eval(expression));  
        } catch (Exception e) {  
            return "Error: " + e.getMessage();  
        }  
    }  
}  