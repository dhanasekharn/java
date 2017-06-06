package collections;

import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
	Vector v=new Vector();
	System.out.println(v.capacity());
	System.out.println(v.getClass().getName());
	for (int i = 0; i <10; i++) {
		v.addElement(i);
			}
v.addElement("A");
System.out.println(v.capacity());
System.out.println(v);
Vector v1=new Vector(10,5);
for (int i = 0; i <10; i++) {
	v1.addElement(i);
		}
v1.addElement("A");
System.out.println(v1.capacity());
}
}
