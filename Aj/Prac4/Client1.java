import java.io.*;  
import java.net.*;  

public class Client1 {  
    public static void main(String[] args) {  
        try (  
            // Use try-with-resources to manage resources automatically  
            Socket socket = new Socket("localhost", 9999);  
            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));  
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  
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

                // Print the server's response  
                System.out.println("Server response: " + reversedString); // Ensure this line ends with a semicolon  
            }  
            System.out.println("Disconnected from server.");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  