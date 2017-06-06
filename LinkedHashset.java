package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<Object> h=new LinkedHashSet<Object>();
	
		h.add("Dhana");
		h.add("sekhar");
		h.add("naidu");
		h.add("naidu");
		h.add(32);
		h.add(null);
		System.out.println(h);
		
		System.out.println(h.add("Dhana"));
				
		
				
	}
}
