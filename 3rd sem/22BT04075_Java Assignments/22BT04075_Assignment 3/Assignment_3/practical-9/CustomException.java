class ArgumentGreaterThanOneException extends Exception 
{
    public ArgumentGreaterThanOneException(String message) 
	{
        super(message);
    }
}

public class CustomException 
{
    public static void main(String[] args) 
	{
        try 
		{
            if(args.length > 1) 
			{
                throw new ArgumentGreaterThanOneException("More than one argument provided.");
            }
			System.out.println("Program executed successfully with one or zero arguments.");
        } 
		
catch(ArgumentGreaterThanOneException e) 
{
            System.err.println("Exception: " + e.getMessage());
        }
    }
}
