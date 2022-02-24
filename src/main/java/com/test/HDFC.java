package com.test;

public class HDFC implements RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hdfc=new HDFC();
		hdfc.creditCards();
		hdfc.personalLoanIntrest();
		hdfc.houseLoanIntrest();
	}
	public void creditCards()
	{
		System.out.println("HDFC credit card provides more offers");
	}
	public void houseLoanIntrest() {
		// TODO Auto-generated method stub
		System.out.println("House loan intrst starts from 6.5%");
	}
	public void goldLoanIntrest() {
		// TODO Auto-generated method stub
	System.out.println("Gold loan starts from 7%");	
	}
	public void personalLoanIntrest() {
		// TODO Auto-generated method stub
		System.out.println("personal starts from 10%");
	}
	public void educationalLoanIntrest() {
		// TODO Auto-generated method stub
		System.out.println("Educational loan starts from 9%");
		
	}

}
