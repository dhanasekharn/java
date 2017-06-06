package collections;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {  
	    //Creating list of Books  
	    LinkedList<Book> list=new LinkedList<Book>();  
	    //Creating Books  
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to list  
	    list.add(b1);  
	    list.add(b2);  
	    list.add(b3);  
	    //Traversing list  
	    for(Book b:list){  
	    System.out.println("Book id:\t"+b.id+"\tName:\t"+b.name+"\tAuthor:\t"+b.author+"\tpublisher:\t"+b.publisher+"\tquantity:\t"+b.quantity);  
	    }  
	}  
}
