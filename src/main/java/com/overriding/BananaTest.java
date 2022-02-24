package com.overriding;

public class BananaTest extends AppleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BananaTest bt=new BananaTest();
		bt.price();
		bt.greenColor();
		
	}
	public void price()
	{
	System.out.println("price is 0.5$");
	}
	public void greenColor()
	{
	System.out.println("GreenColor banana is good for health and its very rare fruit");
	}
	public void season()
	{
	System.out.println("Banana is available in all the season especially we will use for festivals and in home");
	}

}
