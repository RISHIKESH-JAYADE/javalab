package books;

import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		LinkedHashMap<Integer,booklib> bookdb = new LinkedHashMap<Integer,booklib>();
		TreeMap<Double,booklib> sorted_by_price =new TreeMap<Double,booklib>();
		
		Scanner sc = new Scanner(System.in);
		while(true) {	
			System.out.println("enter your choice");
			System.out.println("1.Add a book");
			System.out.println("2.retrive a book details using bookid");
			System.out.println("3.Display in ascending order by price");
			System.out.println("4.exit");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					booklib obj =new booklib();
					obj.setDetails();
					bookdb.put(obj.bookid, obj);
					sorted_by_price.put(obj.getPrice(), obj);
					System.out.println(bookdb);
					System.out.println(sorted_by_price);
					break;
				case 2:
					System.out.println("enter bookId");
					int bid = sc.nextInt();
					booklib n = bookdb.get(bid);
					n.getDetails();
					break;
				case 3:
					for(Map.Entry<Double, booklib> entry : sorted_by_price.entrySet()) {
						System.out.println(entry.getKey());
						entry.getValue().getDetails();
					}
					
			}
		}
	}
}
