import java.io.*;
import java.net.*;
import java.util.*;
public class Client
{
public static void main(String args[]) throws Exception
{
Socket s=new Socket("localhost",777);
BufferedReader br=new BufferedReader(new

InputStreamReader(s.getInputStream()));
System.out.println(br.readLine());
}
}