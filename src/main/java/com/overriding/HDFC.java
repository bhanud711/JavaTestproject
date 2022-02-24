package com.overriding;

public class HDFC implements RBI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hdfc=new HDFC();
		hdfc.rateOfIntestHome();
	}

	public void rateOfIntestHome() {
		// TODO Auto-generated method stub
		System.out.println("6.5%");
	}

	public void rateOfIntrestPersonalLoan() {
		// TODO Auto-generated method stub
		System.out.println("10.25%");
		
	}

}
