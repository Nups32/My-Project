import java.util.Scanner;
class Calc
{
	public static void main(String args[])
	{
		Double a,b,c;
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter a : ");
		a=x.nextDouble();
		
		System.out.println("Enter b : ");
		b=x.nextDouble();
		
		//a=17;
		//b=18;
		System.out.print("Addition = ");
		System.out.println(a+b);
		
		System.out.print("Substraction = ");
		System.out.println(a-b);
		
		System.out.print("Multiplication = ");
		System.out.println(a*b);
		
		c=a/b;
		System.out.print("Devision = ");
		System.out.println(c);
	
	
	}

}