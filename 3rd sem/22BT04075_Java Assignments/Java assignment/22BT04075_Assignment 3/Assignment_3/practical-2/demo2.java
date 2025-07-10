import MyPack.A;
import MyPack.B;
import MyPack.C;
public class PackDemo{
	
	void disp(){
		A objA = new A();
		System.out.println(objA.str);
		B objB = new B();
		System.out.println(objB.str);	
		C objC = new C();
		System.out.println(objC.str);
		D objD = new D();
		System.out.println(objD.str);		
	}
	public static void main(String args[]){
			PackDemo obj = new PackDemo();
			obj.disp();
	}
}