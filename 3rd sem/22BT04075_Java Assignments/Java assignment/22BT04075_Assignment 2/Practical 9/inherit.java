interface TwoDshape
{
    public double calc_area();
}
interface ThreeDshape
{
    public double calc_volume();
}
abstract class shape
{
    abstract void display();
}

class circle extends shape implements TwoDshape
{
    double r;
    double area;
    circle(double r)
	{
        this.r=r;        
    }
    public double calc_area()
	{
        return (22/7)*r*r;
    }
    void display()
	{
        double area=calc_area();
        System.out.println("The Area of Circle is: "+area);
    }
}

class sphere extends shape implements ThreeDshape
{
    double r2;
    double vol;
    sphere(double r2)
    {
        this.r2=r2;
    }
    public double calc_volume()
	{
        return (4/3)*(22/7)*r2*r2*r2;
    }
    void display()
    {
        double vol=calc_volume();
        System.out.println("The Volume of Sphere is: "+vol);
    }
}

class inherit
{
    public static void main(String arg[]){
        circle c=new circle(6.9);
        c.display();
        sphere s=new sphere(6.9);
        s.display();
    }
}