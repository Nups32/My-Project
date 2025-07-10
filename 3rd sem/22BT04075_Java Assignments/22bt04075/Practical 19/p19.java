import java.util.Scanner;

class p19
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int A[][]=new int[4][5];
		A[0]=new int[2];
		A[1]=new int[5];
		A[2]=new int[3];
		A[3]=new int[4];
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}
}