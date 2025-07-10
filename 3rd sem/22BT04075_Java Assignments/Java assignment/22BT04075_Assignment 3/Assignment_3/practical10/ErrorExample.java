public class ErrorExample 
{
    public static void main(String[] args) 
	{
        try 
		{
            throw new OutOfMemoryError("This is an example of an Error.");
        } 
		catch (Error e) 
		{
            System.err.println("Caught an Error: " + e.getMessage());
        }
        System.out.println("Program continues after Error.");
    }
}
