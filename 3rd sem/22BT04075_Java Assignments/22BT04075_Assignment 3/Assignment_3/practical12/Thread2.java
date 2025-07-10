class MyThread2 implements Runnable 
{
	public void run()
	{
		System.out.println("Hello World");
	}
	public static void main(String args[])
	{
		MyThread2 o = new MyThread2();
		Thread t = new Thread(o);
		t.start();
	}
}
