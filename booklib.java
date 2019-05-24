package books;

import java.util.Scanner;

public class booklib {
	Scanner sc = new Scanner(System.in);
	public int bookid;
	private String title;
	private String author;
	private String publisher;
	private Double price;
	
	public Double getPrice() {
		return price;
	}
	
	public void setDetails() {
		System.out.println("enter book details:bookId,title,author,publisher,price");
		int id = sc.nextInt();
		String title = sc.next();
		String author =sc.next();
		String publisher =sc.next();
		double price =sc.nextDouble();
		this.bookid=id;
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
	}
	public void getDetails() {
		System.out.println("bookId : "+bookid);
		System.out.println("title : " +title);
		System.out.println("author : " +author);
		System.out.println("publisher : " +publisher);
		System.out.println("price : " +price);
	} 
}
