//import java.util.Scanner;

class Arithmetic
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[2]);
		
		switch(args[1])
		{
			case "+" :
			System.out.println("Add = "+(a+b));
			break;
			
			case "-":
			System.out.println("Sub = "+(a-b));
			break;
			
			case "X":
			System.out.println("Mul = "+(a*b));
			break;
			
			case "/":
			System.out.println("Div = "+(a/b));
			break;
			
			case "%":
			System.out.println("Modu = "+(a%b));
			break;
			
			default:
			System.out.println("Enter valid operator !!!!");
			
		}
	}
}