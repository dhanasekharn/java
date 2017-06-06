package collections;

import java.util.HashSet;

public class HashsetExample {  
public static void main(String[] args) {  
    HashSet<Book> set=new HashSet<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to HashSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing HashSet  
    for(Book b:set){  
    	 System.out.println("Book id:\t"+b.id+"\tName:\t"+b.name+"\tAuthor:\t"+b.author+"\tpublisher:\t"+b.publisher+"\tquantity:\t"+b.quantity);  
    }
    System.out.println(set.size());
    set.clear();
    System.out.println(set.size());
}  
}  