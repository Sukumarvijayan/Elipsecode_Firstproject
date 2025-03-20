package com.lao.string;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String ->IMMAUTABLE EXAMPLES
		String name ="Suku";
		System.out.println(name.concat("mar"));
		//after concat , name displayed as "Suku"(Not changed, so its a ImMAUTABLE object)
		System.out.println(name);
		
		//StringBUFFER ->MAUTABLE EXAMPLES
		StringBuffer name1 = new StringBuffer("Suku");
		System.out.println(name1.append("mar"));
		//after append , name1 changed to "Sukumar", so its aMAUTABLE object
		System.out.println(name1);
		
		
		//------Stringbuffer methods
		//Reserve--in string we cant use reserve method
		StringBuffer name2 = new StringBuffer("Kirubha");
		System.out.println(name2.reverse());
		
		//Replace
		System.out.println(name2.replace(0, 3, "Riya"));
		
		//delete
		System.out.println(name2.delete(0, 3));
		
		//insert
		System.out.println(name2.insert(4, "sha"));
		
		//capacity - default capacity is 20
		System.out.println(name2.capacity());
		
		//like String we have charat, Substring, length method as well
	}
	

}
