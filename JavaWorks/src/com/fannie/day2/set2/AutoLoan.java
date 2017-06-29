package com.fannie.day2.set2;

public class AutoLoan extends BankLoan implements Income{

	@Override
	public void loanAmount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void repay(int repayAmount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foreClosure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkCreditScore(int creditScore) {
		// TODO Auto-generated method stub
		if(creditScore>740){
			System.out.println("Borrower qualifies for Auto loan based on Credit Score " + creditScore);
		}
		else{
			System.out.println("Borrower does not qualify for Auto loan based on Credit Score " + creditScore);
		}
		
	}

	@Override
	public void verifyIncome(int income) {
		if(income>3000){
			System.out.println("Borrower qualifies for Auto loan based on Income " + income);
		}
		else{
			System.out.println("Borrower does not qualify for Auto loan based on Income " + income);
		}
		
	}
	
}
