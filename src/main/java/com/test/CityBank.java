package com.test;

public class CityBank implements UniversalBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CityBank cb=new CityBank();
		cb.creditCard();
		cb.houseLoanIntrest();
		cb.personalLoanIntrest();
	}
	public void creditCard()
	{
		System.out.println("City bank credit card is good");
	}
	public void houseLoanIntrest() {
		// TODO Auto-generated method stub
		System.out.println("House loan intrest is 6.5%");
	}
	public void studyloanIntrest() {
		// TODO Auto-generated method stub
		System.out.println("StudyLoanintrest is 9%");
	}
	public void personalLoanIntrest() {
		// TODO Auto-generated method stub
		System.out.println("Personal loan intrest is 11%");
	}

}
