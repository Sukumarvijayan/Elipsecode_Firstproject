package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet<String> hashSet = new HashSet<String>();
     hashSet.add("A");
     hashSet.add("A");
     hashSet.add("F");
     hashSet.add("B");
     hashSet.add(null);
     System.out.println(hashSet);
     
     System.out.println(hashSet.contains("B"));
     
     //like arraylist..most of the methods available in hashset(clear, remove, search etc)..do handson
     //iteration using loop
     for (String string : hashSet) {
		System.out.println(string);
	}
     
	}

}
