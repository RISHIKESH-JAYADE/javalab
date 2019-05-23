package contact;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class main {

	public static void main(String[] args) {
		HashMap<Integer,String> contactList = new HashMap <Integer,String>();
		TreeMap<LocalDateTime,Integer> missedList = new TreeMap <LocalDateTime,Integer>();
		Scanner sm = new Scanner(System.in);
	while(true) {
		System.out.println("enter your choice");
		System.out.println("1.Add contact");
		System.out.println("2.Add missedcall");
		System.out.println("3.Display");
		System.out.println("4.exit");
		int choice = sm.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter number");
			Integer num = sm.nextInt();
			System.out.println("enter name");
			String name = sm.next();
			contactList.put(num, name);
			break;
		case 2:
			System.out.println("enter missed call number");
			Integer missedNum = sm.nextInt();
			LocalDateTime time = LocalDateTime.now(); 
			missedList.put(time,missedNum);
			break;
		case 3:
			for(Map.Entry<LocalDateTime, Integer> entry : missedList.entrySet()) {
				System.out.println("time :" + entry.getKey());
				System.out.println("Number :" + entry.getValue());
				System.out.println("enter your choice");
				System.out.println("1.delete");
				System.out.println("2.next missedcall");
				System.out.println("3.Display");
				int choose = sm.nextInt();
				switch(choose) {
				case 1:
					missedList.remove(entry.getKey());
					System.out.println("successfully removed");
					
				case 2:
					continue;
				case 3:
					if(contactList.containsKey(entry.getValue())==true) {
						System.out.println("Name:"+ contactList.get(entry.getValue()));
					}
					else {
						System.out.println("Name: Private Number");
					}
					break;
				}
			}
			System.out.println("missedcall list ended");
			System.exit(0);
		case 4:
			System.exit(0);
		}

	}
	}
}
