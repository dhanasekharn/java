package collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorExampple {

	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		for (int i = 0; i < 10; i++) {
			v.addElement(i);
		}
		//v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);
		Vector v1 = new Vector(10, 5);
		for (int i = 0; i < 10; i++) {
			v1.addElement(i);
		}
Iterator i=v.iterator();
while (i.hasNext()) {
	Integer in = (Integer) i.next();
	if(in%2==0){
		System.out.print(in+"\t");
	}
	else {
		i.remove();
	}
	
}
System.out.println(v);
System.out.println(v.capacity());
System.out.println(v.size());
	 
}
}