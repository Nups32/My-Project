class Sumthread extends Thread
{
int l,u,sum;
Sumthread(int l,int u,String name)
{
super(name);
this.l=l;
this.u=u;
}
public void run()
{
for(int i=1;i<=u;i++)
{
this.sum+=i;
System.out.println(this.getName()+"is running");
}
System.out.println("sum by t1"+this.sum);
}
public static void main(String args[])
{
Sumthread t1=new Sumthread(1,10,"t1");
t1.start();
Sumthread t2=new Sumthread(11,20,"t2");
t2.start();
System.out.println("sum="+(t1.sum+t2.sum));
}}
