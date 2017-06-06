package collections;

import java.util.Stack;

public class Stackaexample {
public static void main(String[] args) {
	Stack s=new Stack();
	s.push("1");
	s.push("z");
	s.push("D");
	s.push("h");
	System.out.println(s.peek());
	System.out.println(s);
	s.pop();
	System.out.println(s);
	System.out.println("search:"+ s.search("D"));
}
}
