import java.util.Vector;
import java.util.Iterator;

class P6
{
	public static void main(String args[])
	{
		Vector<String> V=new Vector<String>();
		V.add("A");
		V.add("B");
		V.add("C");
		V.add("D");
		V.add("E");
		
		Iterator<String>i=V.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}