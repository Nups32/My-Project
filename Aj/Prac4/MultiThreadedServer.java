import java.io.*;  
import java.net.*;  

public class MultiThreadedServer {  
    public static void main(String[] args) {  
        try (ServerSocket serverSocket = new ServerSocket(9999)) {  
            System.out.println("Server running...");  
            while (true) {  
                Socket clientSocket = serverSocket.accept();  
                System.out.println("Client connected: " + clientSocket);  

                // Start a new thread to handle the client  
                ClientHandler clientHandler = new ClientHandler(clientSocket);  
                clientHandler.start();  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  

    static class ClientHandler extends Thread {  
        private final Socket clientSocket;  

        public ClientHandler(Socket socket) {  
            this.clientSocket = socket;  
        }  

        public void run() {  
            try (  
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));  
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);  
            ) {  
                String inputLine;  
                while ((inputLine = in.readLine()) != null) {  
                    // Reverse the input string  
                    String reversedString = new StringBuilder(inputLine).reverse().toString();  
                    // Send the reversed string back to the client  
                    out.println(reversedString);  
                }  
            } catch (IOException e) {  
                e.printStackTrace();  
            } finally {  
                try {  
                    clientSocket.close();  
                    System.out.println("Client disconnected: " + clientSocket);  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
}  