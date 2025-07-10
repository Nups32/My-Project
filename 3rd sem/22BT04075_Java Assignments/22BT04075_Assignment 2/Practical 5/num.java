class num
{
	int x;
	num(int x)
	{
		this.x=x;
	}
	void add(num n)
	{
		int ans=this.x+n.x;
		System.out.print("Addition : "+ans);
	}
	public static void main(String arg[])
	{
		num obj1=new num(10);
		num obj2=new num(20);
		obj1.add(obj2);
	}
}