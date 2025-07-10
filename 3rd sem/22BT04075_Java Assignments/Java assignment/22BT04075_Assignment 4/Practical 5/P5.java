import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class P5
{
	public static void main(String args[])
	{
		ArrayList<Integer> A =new ArrayList<Integer>();
		A.add(10);
		A.add(40);
		A.add(30);
		A.add(20);
		Iterator<Integer> i=A.iterator();
		System.out.println("ArrayList : ");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		LinkedList<Integer> L =new LinkedList<Integer>();
		L.add(90);
		L.add(70);
		
		Iterator<Integer> j=L.iterator();
		System.out.println("Linked List : ");
		while(j.hasNext())
		{
			System.out.println(j.next());
		}
	}
}