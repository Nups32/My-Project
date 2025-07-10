abstract class A
{
	abstract void display();
}
class B extends A
{
	void display()
	{
		System.out.println("This is B");
	}
}
class C extends A
{
	void display()
	{ 
		System.out.println("This is C");
	}
}

class abs 
{
	public static void main(String arg[])
	{
		B b=new B();
		b.display();
		C c=new C();
		c.display();
	}
}

		
		
