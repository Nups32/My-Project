import java.util.Scanner;
class DuplicateNumberException extends Exception 
{
    public DuplicateNumberException(String message) 
	{
        super(message);
    }
}

public class Duplicate
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the elements of the array:");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
        try 
		{
            for (int i=0;i<10;i++) 
			{
                for(int j=i+1;j<10;j++)
				{
					if(arr[i]==arr[j]) 
					{
						throw new DuplicateNumberException("duplicates found !");
					}
					
				}
			}
		System.out.println("no duplicates found");
		}
		catch (DuplicateNumberException e) 
		{
            System.out.println("Exception: " + e.getMessage());
        } 
    }
}
