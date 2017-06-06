package collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class TreesetCustomized {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		TreeSet t1 = new TreeSet(new MyComparator1());
		TreeSet t3 = new TreeSet(new MyComparator2());
		TreeSet t4 = new TreeSet(new MyComparator3());
		TreeSet k = new TreeSet();

		t.add(0);
		t.add(1);
		t.add(2);
		//t.add(null);
		t.add(3);
		t.add(10);
		t.add(9);
		t.add(4);
		t.add(5);
		t.add(6);
		k.addAll(t);
		t1.addAll(t);
		t3.addAll(t);
		t4.add(1);
		t4.add(2);
		t4.add(2);
		t4.add(null);
		System.out.println("default sorting order\n" + k);
		System.out.println(t1);
		System.out.println("Customized sorting order\n" + t);
		System.out.println(t3);
		System.out.println("insertion order:\n"+t4);

	}

}

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer i = (Integer) obj1;
		Integer j = (Integer) obj2;
		if (i > j) {
			return -1;
		} else if (i < j) {
			return +1;
		} else {
			return 0;
		}
	}
}

class MyComparator1 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer i = (Integer) obj1;
		Integer j = (Integer) obj2;
		return i.compareTo(j);
	}
}

class MyComparator2 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer i = (Integer) obj1;
		Integer j = (Integer) obj2;
		return -i.compareTo(j);//we can write in another way as	
		// return j.compareTo(i);
	}
}
class MyComparator3 implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer i = (Integer) obj1;
		Integer j = (Integer) obj2;
		return +1;
	}
}
