import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Employee implements Serializable
{
int empno;
float salary;
String name;
Employee(int empno,float salary,String name)
{
this.empno=empno;
this.salary=salary;
this.name=name;
}
void display()
{
System.out.println("empno:"+this.empno);
System.out.println("salary:"+this.salary);
System.out.println("name:"+this.name);
}
public static void main(String args[])
{
Employee e1=new Employee(1,23456,"d");
Employee e2=new Employee(2,34567,"d1");
Employee e3=new Employee(3,45678,"d2");
try{
FileOutputStream fos=new FileOutputStream("employee1.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(e1);
oos.flush();
oos.writeObject(e2);
oos.flush();
oos.writeObject(e3);
oos.flush();
}catch(Exception e)
{
e.printStackTrace();
}
}}