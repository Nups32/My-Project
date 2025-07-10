//Write a program to accept a line and check how many consonants and vowels are there in
// line.

import java.util.Scanner;



class p12
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		
		String s=sc.nextLine();
		
		char ch;
		int vowel =0;
		int consonant=0;
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowel++;
			}
			
			else if((ch>=65 && ch<=122) )
			{
				consonant++;
			}	
		}
		System.out.println("Vowel is : "+vowel);
		System.out.println("Consonants is : "+consonant);
		
	}
}


