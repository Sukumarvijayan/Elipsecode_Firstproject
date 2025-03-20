package Collections;

import java.util.Stack;
import java.util.Vector;

public class Vectorexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Vector vector = new Vector ();
			vector.addElement("suku");
			vector.addElement("jothi");
			
			System.out.println(vector);
			
			//Remove element
             vector.removeElement("jothi");
			System.out.println(vector);

	}

}
