package com.test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="ramarao";
System.out.println(name);
String name1="DERAN";
String name2="ramarao";
String name3="RAMARAO";
System.out.println(name1);
System.out.println(name.concat(name1));
System.out.println(name.charAt(5));
System.out.println(name.toUpperCase());
System.out.println(name1.toLowerCase());
System.out.println(name.equals(name1));
System.out.println(name.equals(name2));
System.out.println(name.endsWith("rao"));
System.out.println(name.compareTo(name2));
System.out.println(name.equalsIgnoreCase(name3));
String num1="10"; //String variable
String num2="20"; //String variable
System.out.println(num1.concat(num2)); //1020
System.out.println(num1+num2);  //1020
int a=10;
int b=20;
System.out.println(a+b); //30

	}

}
