class X
{
    class Y
	{
        void disp()
		{
            System.out.println("This is Nested class");
        }
    }
}

class A
{
    void display()
	{
        class B
		{
            void inn()
			{
                System.out.println("This is Inner class");
            }
        }
        B obj=new B();
        obj.inn();
    }
}

interface C
{
    void displ();
}

class aniclass
{
    public static void main(String arg[])
	{
        X obj=new X();
        X.Y objY=obj.new Y();
        objY.disp();

        A a=new A();
        a.display();

        C c=new C() 
		{
            public void displ()
			{
                System.out.println("There is Anonymous inner class");
            }
        };
        c.displ();
    }
}