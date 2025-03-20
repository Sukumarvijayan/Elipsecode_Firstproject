package com.lao.string;

public class Javaexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String name = "Agniprasath";
		int number = 3;
		System.out.println(name.charAt(1));
		
		System.out.println(name.charAt(1));
		System.out.println(name.length());
		System.out.println(name.equals("Arul"));
		System.out.println(name.equalsIgnoreCase("AGNIPRASATH"));
		System.out.println(name.isEmpty());
		System.out.println(name.contains("A"));
		System.out.println(name.substring(1));
		//Beginning index(1) included & end index(6) not included
		System.out.println(name.substring(1,3));
		System.out.println(name.concat("Arulprasath"));
		System.out.println(name.replace("g", "G"));
		System.out.println(name.replace("Agni", "Riya"));
		System.out.println(name.indexOf("A"));
		System.out.println(name.indexOf("a",7));
		System.out.println(name.indexOf("i",2));
		System.out.println(name.indexOf("sath",1));
		
		System.out.println(name.trim());
		
		//Convert the give data type to string
		System.out.println(String.valueOf(number));
		
		String uppercase="SUKU";
		System.out.println(uppercase.toLowerCase());
		
		String lowercase="suku";
		System.out.println(lowercase.toUpperCase());
		
		//Returns a joined string with given delimiter
		System.out.println(String.join("-", "Learn","Automation","Online"));
		System.out.println(String.join("/", "30","05","1990"));
		
		//split
		String str= "Am, I, teaching";
		String[] str1 = str.split(",");
		for (String string : str1) {
			System.out.println(string);
		}
		
	}

}
