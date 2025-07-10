import java.io.FileInputStream;
import java.io.FileOutputStream;

class P1
{
	public static void main(String args[])
	{
		try{
			FileInputStream fin=new FileInputStream("in.txt");
			FileOutputStream fout=new FileOutputStream("out.txt");
			while(fin.available() != 0)
			{
				int   ch=fin.read();
				System.out.print((char)ch);
				fout.write((char)ch);
			}
			fin.close();
			 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}