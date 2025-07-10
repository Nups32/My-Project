import java.io.*;  
import java.net.*;  

public class Client {  
    public static void main(String[] args) {  
        final String SERVER_IP = "127.0.0.1"; // Server IP address  
        final int SERVER_PORT = 12345; // Server port number  

        Socket socket = null;  
        InputStream inputStream = null;  
        FileOutputStream fileOutputStream = null;  

        try {  
            // Connect to server  
            socket = new Socket(SERVER_IP, SERVER_PORT);  
            System.out.println("Connected to server.");  

            // Open input stream to receive file  
            inputStream = socket.getInputStream();  

            // Open output stream to write file  
            fileOutputStream = new FileOutputStream("received_file.txt"); // Replace with your desired file name  

            // Receive file from server  
            byte[] buffer = new byte[1024];  
            int bytesRead;  
            while ((bytesRead = inputStream.read(buffer)) != -1) {  
                fileOutputStream.write(buffer, 0, bytesRead);  
            }  

            System.out.println("File received successfully.");  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if (fileOutputStream != null) fileOutputStream.close();  
                if (inputStream != null) inputStream.close();  
                if (socket != null) socket.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}  