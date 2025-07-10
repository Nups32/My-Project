import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Scanner;
class P4
{
	public static void main(String args[])
	{
		int i,sum=0,mul=1,div=1,sub=0,mod=0;
		Scanner sc=new Scanner(System.in);
		try{
			
	
		
		FileOutputStream fout = new FileOutputStream("in.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		
		FileInputStream fin=new FileInputStream("in.txt");
		DataInputStream din=new DataInputStream(fin);

		FileOutputStream fout2 = new FileOutputStream("out.txt");
		DataOutputStream dout2=new DataOutputStream(fout2);
				
		FileInputStream fin2=new FileInputStream("out.txt");
		DataInputStream din2=new DataInputStream(fin2);


		
		
		for(int j=0;j<2;j++)
		{
			System.out.print("Enter a integer : ");
			int a=sc.nextInt();
			dout.writeInt(a);
			
		}
		
		
		for(int j=0;j<2;j++)
		{
			i=din.readInt();
			if(j==0)
			{	
				sum=i;
				sub=i;
				mul=i;
				div=i;
				mod=i;
				
			}
			
			else{
			sum+=i;
			sub-=i;
			mul*=i;
			div/=i;
			mod%=i;
			}
			//dout.writeUTF("Sum = ");
			//dout2.writeInt(sum);
			
		
		}
		dout2.writeUTF("Sum = "+sum);
		dout2.writeUTF("Subtract = "+sub);
		dout2.writeUTF("Multiplication = "+mul);
		dout2.writeUTF("Divide = "+div);
		dout2.writeUTF("Modulo = "+mod);
		for(int j=0;j<5;j++)
		{
			
			System.out.println(din2.readUTF());
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		//System.out.println("Sum = "+sum);
		//System.out.println("Subtract = "+sub);
		//System.out.println("Multiplication = "+mul);
		//System.out.println("Divide = "+div);
		//System.out.println("Modulo = "+mod);
		
	}
}