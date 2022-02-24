package com.test;

public class Forest extends Lion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forest fr=new Forest();
		fr.nonVegitarian();
		fr.rabbit();
	}

	@Override
	public void nonVegitarian() {
		// TODO Auto-generated method stub
	System.out.println("Lion is a non-vegitarian");	
	}

	@Override
	public void rabbit() {
		// TODO Auto-generated method stub
		System.out.println("Lion can kill rabbit easy and it can eat in single term");
	}

}
