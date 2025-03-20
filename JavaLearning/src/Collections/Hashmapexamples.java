package Collections;

import java.util.HashMap;

public class Hashmapexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Suku");
		hashMap.put(2, "Jothi");
		hashMap.put(5, "Babu");
		hashMap.put(3, "Kiru");
		
		System.out.println(hashMap);
		//Copy one map to another
		HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
		hashMap1.putAll(hashMap);	
		System.out.println(hashMap1);
	     
	    //to check the key is present in the map
	    System.out.println(hashMap.containsKey(2));
	    //to check the value is present in the map
	    System.out.println(hashMap.containsValue("Suku"));
	    //clone the map without using put all
	    System.out.println(hashMap.clone());
	    //check map is empty or not
	    System.out.println(hashMap.isEmpty());
	    //Fetch the set of key only
	    System.out.println(hashMap.keySet());
	    //Fetch the set of values only
	    System.out.println(hashMap.values());
	    //Fetch the particular values
	    System.out.println(hashMap.get(2));
	    //fetch the entry set
	    System.out.println(hashMap.entrySet());
	}
}
