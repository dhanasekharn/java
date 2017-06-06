package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListInterfaceObject {
public static void main(String[] args) {
	Vector<Object> v= new Vector<Object>();
	Enumeration e=v.elements();
	Iterator i=v.iterator();
	ListIterator li=v.listIterator();
	System.out.println(v);
	System.out.println(e);
	System.out.println(i);
	System.out.println(li);
}
}
