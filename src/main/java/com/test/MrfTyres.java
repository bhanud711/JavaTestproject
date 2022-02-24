package com.test;

public class MrfTyres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MrfTyres mrf=new MrfTyres();
		mrf.twoWheelerTyres();
		mrf.twoWheelerTyres("HeroHonda");
		mrf.twoWheelerTyres("HeroHonda", 100);
	}
	public void twoWheelerTyres()
	{
	System.out.println("Hello i am twoWheeler tyres");	
	}
	public void twoWheelerTyres(String bikename)
	{
		System.out.println("Tyres use for"+bikename);
	}
public void twoWheelerTyres(String bikename,int price)
{
	System.out.println("Tyres use for "+bikename);
	System.out.println("Price of the tyre"+price);
}
}
