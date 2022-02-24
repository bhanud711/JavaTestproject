package com.isa;

public class RunTimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
int a=10;
int b=2;
int c=a/b;
System.out.println(c);
int d=0;
int e=a/d;
System.out.println(e);
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		e.printStackTrace();
		}
		finally {
		System.out.println("Hello Shinwari");	
		}
	}

}
