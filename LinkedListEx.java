package collections;

import java.util.LinkedList;

public class LinkedListEx {
public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<String>();
	l.add("dhana");
	l.add("sekhar");
	l.add("naidu");
	l.add(0,"nallagtla");
	l.addFirst("n");
	l.addLast("Eng");
	l.set(0, "kamma");
	System.out.println(l.get(4));
	System.out.println(l);
	l.remove(0);
	l.removeLast();
	System.out.println(l);
}
}
