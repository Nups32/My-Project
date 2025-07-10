class Person
{
	int age;
	float salary;
	String name;
	void setData(int age,float salary, String name)
	{
		this.age=age;
		this.salary=salary;
		this.name=name;
	}
	void getData()
	{
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Salary = "+salary);
	}
	public static void main(String arg[])
	{
		Person p=new Person();
		p.setData(18,50000,"Nupur");
		p.getData();
	}
}