import java.util.Scanner;

class check{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check : ");
		
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("The Entered Number is Positive.");
		}
		else if(num<0)
		{
			System.out.println("The Entered Number is negative.");
		}
		else
		System.out.println("The entered number is Zero.");
	}

}