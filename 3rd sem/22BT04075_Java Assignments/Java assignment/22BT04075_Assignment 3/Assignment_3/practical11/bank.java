import java.util.Scanner;
class InvalidPinException extends Exception
{
	public InvalidPinException(String msg)
	{
		super(msg);
	}
}
class TestPin
{
	static void validate (int pin) throws InvalidPinException
	{
		if(pin==1234)
		{
			System.out.println("Welcome to the ATM");
		}
		else
		{
			throw new InvalidPinException("Invalid Pin");
		}
	}
}
class InsufficientFundException extends Exception
{
	public InsufficientFundException(String msg)
	{
		super(msg);
	}
}
class TestFund
{
	static float fund;
	TestFund(float fund)
	{
		this.fund=fund;
	}
	static void withdraw(float money) throws InsufficientFundException
	{
		float newFund=fund-money;
		if(newFund<0)
		{
			throw new InsufficientFundException("Not Sufficient Fund");
		}
		else
		{
			fund=newFund;
			System.out.println("Balance After Withdraw : "+fund);
		}	
	}
}

class Bank
{
    public static void main(String arg[])
    {
		Scanner sc=new Scanner(System.in);
		TestFund t=new TestFund(2000.00f);
        try
        {
			for(int i=0;i<3;i++)
			{
				System.out.print("Enter PIN : ");
				int pin=sc.nextInt();
				TestPin.validate(pin);
				float money;
				System.out.println("Enter Your Amount for withdraw : ");
				money=sc.nextInt();
				System.out.println("Withdrawing amount : "+money);
				TestFund.withdraw(money);
			}
		}
		catch(InvalidPinException x)
		{
			System.out.println("Exception Caught : "+x);
		}
		catch(InsufficientFundException e)
		{
			System.out.println(e.getMessage());
		}
	}
}


	