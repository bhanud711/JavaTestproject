package com.test;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=100;
int b=20;
int c=56;
int d=700;
int e=65;
System.out.println((a>b)&&(d>e));  //T&&T-->T
System.out.println((c>e)&&(e>b)); //F&&T---F
System.out.println((d>a)&&(b>e)); //T&&F--F
System.out.println((a>b)||(d>e)); //T||T--T
System.out.println((c>e)||(e>b)); //F||T--T
System.out.println((d>a)||(b>e)); //T||F--T
System.out.println((a>d)||(c>d)); //F||F---F
	}

}
