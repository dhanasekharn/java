package collections;

import java.util.ListIterator;
import java.util.Vector;

public class LIstIteratorExample {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Dhana");
		v.add("sekhAaR");
		v.add("naidu");
	ListIterator l=v.listIterator();
	System.out.println(v);
	System.out.println(l.next());


	}
}
