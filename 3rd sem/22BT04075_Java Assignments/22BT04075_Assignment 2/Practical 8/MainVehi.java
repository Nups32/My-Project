class vehi
{
	String vtype;
	vehi(String vtype)
	{
		this.vtype=vtype;
	}
	void display()
	{
		System.out.println("Vehicle Type = "+vtype);
	}
}
class Car extends vehi
{
	String modelt;
	String comp;
	Car(String vtype,String comp,String modelt)
	{
		super(vtype);
		this.comp=comp;
		this.modelt=modelt;		
	}
	void display()
	{
		System.out.println("Vehicle Info : ");
		super.display();
		System.out.println("Company Name = "+comp);
		System.out.println("Model = "+modelt);
	}
}

class MainVehi
{
	public static void main(String arg[])
	{
		Car c=new Car("Sedan","Maruti","Ciaz");
		c.display();
		Car c1=new Car("SUV","Mahindra","Scorpio N");
		c1.display();
	}
}
