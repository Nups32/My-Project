import java.util.Scanner;

class p14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String s=sc.nextLine();
		
		char ch;
		char r;
		int up=0;
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			
			
			if(i==0 && ch.isUpperCase(ch))
			{
				up++;
			}
			else if(ch.isUpperCase(ch))
			{
					r=s.charAt(i-1);
				if(r.isWhitespace(r))
				up++;
			
		}
		
		}
		System.out.print("Word start with upper case : "+up);
			

	}
}