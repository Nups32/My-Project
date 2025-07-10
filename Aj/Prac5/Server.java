import java.io.*;  
import java.net.*;  

public class Server {  
    public static void main(String[] args) {  
        final int PORT = 12345;  
        ServerSocket serverSocket = null;  
        Socket clientSocket = null;  
        FileInputStream fileInputStream = null;  
        BufferedOutputStream bufferedOutputStream = null;  

        try {  
            serverSocket = new ServerSocket(PORT);  
            System.out.println("Server started. Waiting for client...");  

            // Accept client connection  
            clientSocket = serverSocket.accept();  
            System.out.println("Client connected: " + clientSocket);  

            // Open input stream to read the file  
            File file = new File("G:\\College material\\Nupur_Aj\\Prac5\\Nupur.txt"); // Replace with your file path  
            fileInputStream = new FileInputStream(file);  

            // Open output streams to send the file  
            OutputStream outputStream = clientSocket.getOutputStream();  
            bufferedOutputStream = new BufferedOutputStream(outputStream);  
            
            // Send file to client  
            byte[] buffer = new byte[1024];  
            int bytesRead;  
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {  
                bufferedOutputStream.write(buffer, 0, bytesRead);  
            }  

            bufferedOutputStream.flush();  
            System.out.println("File sent successfully.");  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if (fileInputStream != null) fileInputStream.close();  
                if (bufferedOutputStream != null) bufferedOutputStream.close();  
                if (clientSocket != null) clientSocket.close();  
                if (serverSocket != null) serverSocket.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
}  