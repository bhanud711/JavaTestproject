package com.test;

public class Country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c=new Country();
		c.people();
		int d=c.count(10, 20);   //30
		System.out.println(d);
		String pp=c.state("Zara", "Nila");
		System.out.println(pp);
	}
	public void people()
	{
		System.out.println("Mixed people");
		
	}
	public int count(int a, int b)
	{
		int c=a+b;   //c=30
		return c;
	}
	public String state(String name,String name2)
	{
		String name3;
		return name3=name.concat(name2);//ZaraNila
		
	}
	

}
