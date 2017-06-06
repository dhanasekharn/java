package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {

		ArrayList<Emp> al = new ArrayList<Emp>();
		List<Emp> emps = new ArrayList<>();
		Emp e1 = new Emp(1, "Dhana");
		Emp e2 = new Emp(2, "sekhar");
		System.out.println(al.getClass().getName());
		al.add(e1);
		al.add(e2);
		ArrayList<Emp> al2 = new ArrayList<Emp>();
		Emp e3 = new Emp(3, "naidu");
		Emp e4 = new Emp(4, "dhanu");
		al2.add(e3);
		al2.add(e4);
		al.addAll(al2);
		// by using for each
		for (Emp emp : al) {
			System.out.println("name:\t" + emp.name + " \t id:\t" + emp.id);

		}

	
		
		

		al.removeAll(al2);
		// al.remove(0);
		System.out.println("\n");
		for (Emp emp : al) {
			System.out.println("name:\t" + emp.name + " \t id:\t" + emp.id);

		}
		al.addAll(al2);
		al.retainAll(al2);
		System.out.println("\n");
		for (Emp emp : al) {
			System.out.println("name:\t" + emp.name + " \t id:\t" + emp.id);

		}
		System.out.println("\nprinting by using iterator\n");
		Iterator<Emp> itr = al.iterator();
		while (itr.hasNext()) {
			Emp e = (Emp) itr.next();
			System.out.println("name:\t"+e.name + "id:\t" + e.id);
		}

	}
}
