import java.util.Scanner;

class mark
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first subject mark : ");
		int a=sc.nextInt();
		
		System.out.print("Enter second subject mark : ");
		int b=sc.nextInt();
		
		System.out.print("Enter third subject mark : ");
		int c=sc.nextInt();
		
		System.out.print("Enter fourth subject mark : ");
		int d=sc.nextInt();
		
		System.out.print("Enter fifth subject mark : ");
		int e=sc.nextInt();
		
		System.out.print("Enter sixth subject mark : ");
		int f=sc.nextInt();
		
		float per=(a+b+c+d+e+f)/6;
		System.out.println("Percentage = "+per);
	}
}