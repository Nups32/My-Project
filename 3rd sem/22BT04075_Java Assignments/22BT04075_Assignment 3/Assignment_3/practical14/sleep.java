class SleepDemo extends Thread 
{
	int sec;
	SleepDemo(int sec, String name)
	{
		super(name);
		this.sec=sec;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(this.getName());
			try
			{
				Thread.sleep(sec);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread is interrupted");
			}
		}
	}
	public static void main(String arg[])
	{
		SleepDemo t1=new SleepDemo(1000,"Hello");
		t1.start();
		SleepDemo t2=new SleepDemo(3000,"World");
		t2.start();
	}
}