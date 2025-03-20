package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedHashSet<String> LinkedhashSet = new LinkedHashSet<String>();
		 LinkedhashSet.add("A");
		 LinkedhashSet.add("A");
		 LinkedhashSet.add("F");
		 LinkedhashSet.add("B");
	     LinkedhashSet.add(null);
	     System.out.println(LinkedhashSet);
	     
	     System.out.println(LinkedhashSet.contains("B"));
	     
	     //like arraylist..most of the methods available in hashset(clear, remove, search etc)..do handson
	     //iteration using loop
	     for (String string : LinkedhashSet) {
			System.out.println(string);
		}

	}

}
