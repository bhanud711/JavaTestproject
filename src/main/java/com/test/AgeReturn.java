package com.test;

public class AgeReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeReturn ag=new AgeReturn();
		int b=ag.myAge(30);
		System.out.println("B vale is "+b);
		ag.teenAge(14);
		float q=ag.height(6.5f);
		System.out.println("Q value is"+q);
	}
public int myAge(int a)
{
	return a;
}

public void teenAge(int c)
{
	
}
public float height(float p)  //6.5
{
	return p;
}

}
