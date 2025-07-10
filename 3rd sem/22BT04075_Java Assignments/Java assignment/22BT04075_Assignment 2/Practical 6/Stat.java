class Stat
{ 	
	static int x;
	int y;
	void disp()
	{	
		x++;
		y++;
		System.out.println("Static variable x = "+x);
		System.out.println("Normal variable y = "+y);
	}
	static void dispStat()
	{
		System.out.println("Static method");
	}
	public static void main(String args[])
	{
		Stat obj1=new Stat();
		obj1.disp(); 
		Stat obj2=new Stat();
		obj2.disp(); 
		dispStat();
	}
}
