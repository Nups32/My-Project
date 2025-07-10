
class Employee
{
	static int c;
	String name;
	int age;
	int salary;
	int id;
	
	Employee(String name, int age, int salary)
	{
		this.name=name;
		this.id=++c;
		this.age=age;
		this.salary=salary;
	}
	void Display()
	{
	    System.out.println("Employee ID = "+id);
		System.out.println("Student name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Salary = "+salary);
	}
	public static void main(String arg[])
	{
		Employee e[]=new Employee[5];
		e[0] = new Employee("Nupur",18,40000);
		e[1] = new Employee("Diya",18,45000);
		e[2] = new Employee("Tamanna",18,46000);
		e[3] = new Employee("Jalmayee",18,47000);
		e[4] = new Employee("Princy",18,50000);
		for(int i=0;i<5;i++)
		{
			e[i].Display();
			System.out.println();
		}
	}
}