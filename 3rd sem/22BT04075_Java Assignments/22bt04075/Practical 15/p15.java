import java.util.Scanner;

class p15
{
	public static void main(String arg[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Value : ");
	String s=sc.nextLine();
	
	String r="";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		r=r+s.charAt(i);
	
	}
	if(s.equals(r))
	{
		System.out.println("String or number is palindrome : ");
	}
	else{
	System.out.println("not palindrome");
	}
	
	
	}

}
