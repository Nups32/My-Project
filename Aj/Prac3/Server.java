import java.io.*;
import java.net.*;
import java.util.*;
public class Server
{
public static void main(String args[]) throws IOException
{
ServerSocket ss=new ServerSocket(777);
Socket s=ss.accept();
DataOutputStream out=new DataOutputStream(s.getOutputStream());
out.writeBytes("Date:"+(new Date()).toString());
out.close();
s.close();
}
}