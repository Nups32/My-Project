class NotAllowedToVote  extends Exception  
{  
    public NotAllowedToVote (String str)  
    {  	 
        super(str);  
    }  
}  

class Cust_Ex
{  
	static void validate (int age) throws NotAllowedToVote
	{    
		if(age < 18)
		{  
			throw new NotAllowedToVote("Not Eligible to vote");    
		}  
		else 
		{   
			System.out.println("Eligible to vote");   
		}  
	}
	public static void main(String args[])  
		{  
			try  
			{  
				validate(13);  
			}  
			catch (NotAllowedToVote ex)  
			{  System.out.println("Caught the exception"); 
				System.out.println("Exception occured: " + ex);  
			}  	
		}  
}  

