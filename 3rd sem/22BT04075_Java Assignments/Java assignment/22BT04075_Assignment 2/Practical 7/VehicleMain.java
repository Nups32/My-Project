class Vehicle
{
	int n;
	Vehicle(int n)
	{
		this.n=n;
	}
	void disp()
	{
		System.out.println("No. of Wheels : "+n);
	}
}

class TwoWheeler extends Vehicle
{
	TwoWheeler(int n)
	{
		super(n);
	}
}

class FourWheeler extends Vehicle
{
	FourWheeler(int n)
	{
		super(n);
	}
}

class Bike extends TwoWheeler
{
	Bike(int n)
	{
		super(n);
	}
	void disp()
	{
		super.disp();
		System.out.println("This is Bike");
		
	}
}

class Scooty extends TwoWheeler
{
	Scooty(int n)
	{
		super(n);
		
	}
	void disp()
	{
		super.disp();
		System.out.println("This is scooty");
	}
}

class Car extends FourWheeler
{
	Car(int n)
	{
		super(n);
	}
	void disp()
	{
		super.disp();
		System.out.println("This is car");
	}
}

class Truck extends FourWheeler
{
	Truck(int n)
	{
		super(n);
	}
	void disp()
	{
		super.disp();
		System.out.println("This is truck");
	}
}

class VehicleMain
{
	public static void main(String arg[])
	{
		Bike b=new Bike(2);
		b.disp();
		Scooty s=new Scooty(2);
		s.disp();
		Car c=new Car(4);
		c.disp();
		Truck t=new Truck(4);
		t.disp();
	}
}
