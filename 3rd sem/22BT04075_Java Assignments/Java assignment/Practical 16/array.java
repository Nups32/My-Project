import java.util.Scanner;
class array
{
public static void main(String args[])
{
int A[]=new int[10];
int i;
Scanner sc=new Scanner(System.in);
for(i=0;i<10;i++)
{
System.out.println("Enter the elements:");
A[i]=sc.nextInt();
}
int sum=0;
for(i=0;i<10;i++)
{
sum=sum+A[i];
}
int avg=sum/10;
int max=A[0];
int min=A[0];
for(i=0;i<10;i++)
{
if(max<A[i])
max=A[i];
if(min>A[i])
min=A[i];
}
System.out.println("sum="+sum);
System.out.println("Avg="+avg);
System.out.println("Max="+max);
System.out.println("Min="+min);
}
}