package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylistexamples {
	
	
	public void arrayexamples() {
		
		//below line -its dynamic polymorphism {parent = new child() reference)
		//<String> its called as generic..we can add only string value to the list
		List<String> str1 = new ArrayList<String>();
		
		//Arraylist will accept duplicate values(we can same values multiple times)
		//Arraylist wil maintain insert order[they way we adding..it will display same way]
		//add used to add the stringvalues to the array list
		str1.add("Suku");
		str1.add("Suku");
		str1.add("Hari");
		str1.add("Jothi");
		
		System.out.println(str1);
		//get to read the stored values in the array
		System.out.println(str1.get(0));
		//indexOf to get the position of the string
		System.out.println(str1.indexOf("Hari"));
		//particlular string not present, it will return "-1"
		System.out.println(str1.indexOf("Kirubha"));
	
		//copy the arraylist to another arraylist bu using addall
		List<String> str2 = new ArrayList<String>();
		str2.addAll(str1);
		System.out.println(str2);
		
		//remove the value based on index or direct string by using remove
		str2.remove(0);
		System.out.println(str2);
		str2.remove("Hari");
		System.out.println(str2);
		//to clear all by using clear
		str2.clear();
		System.out.println(str2);
		//we can add null string in array list
		str1.add(null);
		System.out.println(str1);
		
	    //To replace the particular value with another value using set
		str1.set(0, "Kiru");
		System.out.println(str1);
		
		System.out.println(str1.isEmpty());
		
		//to print array list one by one using for each
		for (String string : str1) {
			System.out.println(string);
			//str1.add("kumar");
		}
		
		//to print array list one by one using for loop
		for (int i = 0; i < str1.size(); i++) {
			System.out.println(str1.get(i));
		}
		System.out.println("------------------------------");
		//to print array list one by one using ListIterator
		//in ListIterator - Forward & backward option available to print the array
		
	    ListIterator<String> listIterator = str1.listIterator();
	    while (listIterator.hasNext()) {
			//String string = (String) listIterator.next();
			System.out.println(listIterator.next());	
		}
	    
	    while (listIterator.hasPrevious()) {
			//String string = (String) listIterator.next();
			System.out.println(listIterator.previous());	
		}
	   
		System.out.println("------------------------------");
		//to print array list one by one using Iterator
		//in Iterator - only Forward option available to print the array
		
		Iterator<String> iterator = str1.iterator();
		while (iterator.hasNext()) {
			//String string = (//String) iterator.next();
			System.out.println(iterator.next());
		}
		System.out.println("------------------------------");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylistexamples str = new Arraylistexamples();
		str.arrayexamples();
	}

}
