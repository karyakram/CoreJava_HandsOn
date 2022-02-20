package corejava.hoa.day6.que4;

import java.util.Scanner;
import java.util.TreeSet;

class Book implements Comparable<Book>{
	int id, price, quantity;
	String name, author, publisher;
	public Book(int id, String name, String author, String publisher, int quantity, int price){
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
		this.price = price;
	}	
	
	@Override
	public int compareTo(Book b){
		if(this.quantity > b.quantity)
			return 1;
		else if(this.quantity < b.quantity)
			return -1;
		return 0;
	}
}

public class TreeSetDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 0;
		int id, price, quantity;
		String name, author, publisher;
		Book book = null;
		TreeSet<Book> bookSet = new TreeSet<>();
		System.out.println("How many entries?");
		n = s.nextInt();
		for(int i = 0; i < n; i++){
			id = s.nextInt();
			s.nextLine();
			name = s.nextLine();
			author = s.nextLine();
			publisher = s.nextLine();
			price = s.nextInt();
			quantity = s.nextInt();
			book = new Book(id, name, author, publisher, quantity, price);
 			bookSet.add(book);
		}
		int maxPrice = 0;
		Book maxBook = null;
		for(Book b: bookSet){
			if(b.price > maxPrice)
				maxBook = b;
			if(b.author.equals("Galvin"))
				System.out.println("Galvin wrote "+b.name+".");	
				
		}
		System.out.println("Book with max price is "+maxBook.name + " and quantity is " + maxBook.quantity +".");
	}
}