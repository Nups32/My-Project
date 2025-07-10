import java.io.*;  
import java.net.*;  

public class Client2 {  
    public static void main(String[] args) {  
        try (  
            // Establishing a connection to the server  
            Socket socket = new Socket("localhost", 9999);  
            // BufferedReader for user input from the console  
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));  
            // PrintWriter to send data to the server  
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  
            // BufferedReader to read data from the server  
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))  
        ) {  
            System.out.println("Connected to server.");  
            String userInput;  

            // Continuously read user input from the console  
            while ((userInput = consoleInput.readLine()) != null) {  
                // Send user input to the server  
                out.println(userInput);  

                // Receive the reversed string from the server  
                String reversedString = in.readLine();  
                System.out.println("Server response: " + reversedString);  
            }  

            System.out.println("Disconnected from server.");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  