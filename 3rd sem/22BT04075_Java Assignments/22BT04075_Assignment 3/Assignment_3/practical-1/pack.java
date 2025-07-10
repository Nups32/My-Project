package mypack;
class A
	{
		String str = "Hello";
	}
class B extends A 
	{
		String str1 = "Hey";
	}
class C extends B 
	{
		String str2 = "Welcome";
	}
class PackDemo extends C{
	void display()
	{
		System.out.println("Class A:" + str);
		System.out.println("Class B:" + str1);
		System.out.println("Class C:" + str2);
	}
	public static void main (String args[])
	{
		PackDemo obj = new PackDemo();
obj.display();
	}
}

