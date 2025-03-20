package Collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//add the value to the list
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(1);
		linkedlist.add(5);
		linkedlist.add(6);
		
		System.out.println(linkedlist);
		
		//Add the element to the first position
		linkedlist.addFirst(5);
		
		//Add the element to the last position
		linkedlist.addLast(10);
		System.out.println(linkedlist);
		
		//Get the firstelement of the list
		System.out.println(linkedlist.get(0));
		//another method Get the firstelement of the list
		System.out.println(linkedlist.getFirst());
		
		//Get the lastelement of the list
		System.out.println(linkedlist.getLast());
		
		//REmove the first & last element in the list
		System.out.println(linkedlist.removeFirst());
		System.out.println(linkedlist.removeLast());
		System.out.println(linkedlist);
		
		//Poll method & pollfirst & remove ->delete the first element in the list
		System.out.println(linkedlist.poll());
		
		//polllast  delete the last element in the list
		System.out.println(linkedlist.pollLast());
		System.out.println(linkedlist);
		
		//Add again
		linkedlist.add(1);
		linkedlist.add(5);
		linkedlist.add(6);
		System.out.println(linkedlist);
		
		//removefirstoccurence
		System.out.println(linkedlist.removeFirstOccurrence(5));
		
		//removelastoccurence
		System.out.println(linkedlist.removeLastOccurrence(6));
		System.out.println(linkedlist);
		
		//retrieve the values from the arraylist using For each
		//by using simple for loop, while loop, iterator also we retrieve the values from the arraylist
		for (Integer integer : linkedlist) {
			System.out.println(integer);
		}
		
	}

}
