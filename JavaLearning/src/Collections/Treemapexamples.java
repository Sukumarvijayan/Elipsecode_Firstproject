package Collections;

import java.util.TreeMap;

public class Treemapexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Suku");
		treeMap.put(2, "Jothi");
		treeMap.put(5, "Babu");
		treeMap.put(3, "Kiru");
		
		//based on Key values(Integer or alpha) ->it will be sorted
		System.out.println(treeMap);
		//if there is duplicate key, values will override..last added will display)
		treeMap.put(4, "savi");
		treeMap.put(4, "Arul");
        System.out.println(treeMap);
	}

}
