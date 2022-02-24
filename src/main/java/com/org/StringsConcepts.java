package com.org;

public class StringsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="rama";
String name1="KRISHNA";
String name2="rama";
String name3="RAMA";
System.out.println(name);
System.out.println(name.toUpperCase());
System.out.println(name1.toLowerCase());
System.out.println(name.concat(name1));
System.out.println(name.equals(name2));
System.out.println(name.equals(name1));
System.out.println(name.equals(name3));
System.out.println(name.equalsIgnoreCase(name3));
System.out.println(name.charAt(2));
System.out.println(name.endsWith("a"));
System.out.println(name.isEmpty());
System.out.println(name.length());
System.out.println(name.replaceAll("rama", "shinwari"));
	}

}
