// Write a program to find length of string and print second half of the string.

import java.util.Scanner;

class p11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String s=sc.nextLine();
		
		int length=s.length();
		int halfLength=length/2;
		
		System.out.println("Length : "+length);
		
		System.out.println("Second half of Strng is : "+s.substring(halfLength));
		
		
	}
}