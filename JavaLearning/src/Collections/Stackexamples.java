package Collections;

import java.util.Stack;

public class Stackexamples {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //push to add
		Stack<String> stack = new Stack<String> ();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		//pop to delete - delete last stored element
		stack.pop();
		System.out.println(stack);
		
		//search
		System.out.println(stack.search("B"));
		
		//search - -1 return id specific element not present in array
	    System.out.println(stack.search("C"));
	}

}
