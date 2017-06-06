package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {
public static void main(String[] args) {
	HashMap m=new HashMap();
	m.put(101, "dhana");
	m.put(102, "sekhar");
	m.put(103, "naidu");
	System.out.println(m);
	System.out.println(m.put(104, "Dhoni"));
	Set s=m.keySet();
	System.out.println(s);
	Collection c=m.values();
	System.out.println(c);
	Set s1=m.entrySet(); 	
	Iterator itr=s1.iterator();
	while (itr.hasNext()) {
		Map.Entry object = (Map.Entry) itr.next();
		System.out.println(object.getKey());
		if(object.getKey().equals(104)){
			m.put(104, "N");
		}
		
	}
	System.out.println(m);
}
}
