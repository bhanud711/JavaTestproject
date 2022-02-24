package com.test;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=5;
int c=3;
int d=7;
System.out.println((a>b)&&(d>c)); //true&&true--->True
	System.out.println((a>b)&&(c>d)); //true&&false--False
	System.out.println((a>c)||(d<b)); //true||false---true
	System.out.println((a<c)&&(b>d));//false||false---false
	
	for(int i=5;i<=100;i=i+4)
	{
	System.out.println("vdghfjgfgfjdsgfj["+i+"]");	
	}
	}

}
