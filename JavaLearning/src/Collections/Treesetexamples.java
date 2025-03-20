package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> integers = new TreeSet<Integer>();
		integers.add(10);
		integers.add(2);
		integers.add(1);
		integers.add(5);
		integers.add(9);
		integers.add(3);
		
		//
		System.out.println(integers);
		
		//first()
		System.out.println(integers.first());
		//last()
		System.out.println(integers.last());
		//headset()
		System.out.println(integers.headSet(3));
		//tailset()
		System.out.println(integers.tailSet(5));
		//subset
		System.out.println(integers.subSet(1,9));
		//comparator() -> it will return null if the sorting is default natural order 
		System.out.println(integers.comparator());
		//immediate higher of 3
		System.out.println(integers.higher(3));
		//immediate lower of 3
		System.out.println(integers.lower(9));
		//display first element & remove also
		System.out.println(integers.pollFirst());
		//display last element & remove also
		System.out.println(integers.pollLast());
		//display after poll
		System.out.println(integers);
		//descending order
		System.out.println(integers.descendingSet());
		//loop
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
