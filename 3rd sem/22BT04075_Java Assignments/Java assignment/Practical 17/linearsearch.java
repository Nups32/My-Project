import java.util.Scanner;
class LinearSearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[5];
		int num,i;
		boolean f=false;
		for(i=0;i<5;i++)
		{
			System.out.println("Enter Elements:");
			A[i]=sc.nextInt();
		}
		System.out.println("Enter the number you want to search");
		num=sc.nextInt();
		for(i=0;i<5;i++)
		{
			if(num==A[i])
			 {
				 f=true;
				 break;
			 }
			
		}
		   if(f)
				System.out.println("Element found!");
			else
				System.out.println("Element not found!!");
		
	}
}

