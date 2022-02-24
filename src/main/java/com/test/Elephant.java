package com.test;

public class Elephant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant ele=new Elephant();
		Elephant ele1=new Elephant(900,"orange");
	}
	public Elephant()
	{
		System.out.println("Elephant color is grey");
	}
	public Elephant(int weight,String fruits)
	{
	System.out.println("Elephant weight is"+weight);
	System.out.println("Elephant eats "+fruits);
	}

}
