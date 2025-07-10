class stu
{
	String student_name;
	int roll_no;
	int totalmarks;
	stu()
	{
		this.student_name="Nupur";
		this.roll_no=75;
		this.totalmarks=460;
	}
	stu(String student_name, int roll_no, int totalmarks)
	{
		this.student_name=student_name;
		this.roll_no=roll_no;
		this.totalmarks=totalmarks;
	}
	void Display()
	{
		System.out.println("Student name = "+student_name);
		System.out.println("Roll no = "+roll_no);
		System.out.println("Total marks = "+totalmarks);
	}
	public static void main(String arg[])
	{
		stu s1=new stu();
		stu s2=new stu("Nandish",74,470);
		
		s1.Display();
		s2.Display();
	}
}