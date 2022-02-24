package com.test;

public class AmazonForest extends WorldLion{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonForest af=new AmazonForest();
		af.forest();
		af.nonVeg();
		af.cub();
	}

	@Override
	public void nonVeg() {
		// TODO Auto-generated method stub
	System.out.println("Lion eats non-veg");	
	}

	@Override
	public void cub() {
		// TODO Auto-generated method stub
		System.out.println("lion cub");
	}

}
