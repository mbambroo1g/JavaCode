package com.fannie.day2.set2;

public class MortgageLoan extends BankLoan implements Income{
	private int loanAmount;
	private int creditScore;
	private int income;
	
	public MortgageLoan (int loanAmount, int creditScore, int income){
		this.loanAmount = loanAmount;
		this.creditScore = creditScore;
		this.income = income;
	}
	
	@Override
	public void checkCreditScore(int creditScore) {
		// TODO Auto-generated method stub
		if(creditScore>770){
			System.out.println("Borrower qualifies for Mortgage loan based on Credit Score " + creditScore);
		}
		else{
			System.out.println("Borrower does not qualify for Mortgage loan based on Credit Score " + creditScore);
		}
		
	}

	@Override
	public void verifyIncome(int income) {
		System.out.println("User income is: " + income);
		System.out.println(income>5000?"Borrower qualifies for Mortgage Loan based on income.":"Borrower does not qualify for Mortgage Loan based on income.");
		
	}


	@Override
	public void repay(int repayAmount) {
		loanAmount = loanAmount - repayAmount;
		System.out.println("The loan repayAmount is: " + repayAmount);
		
	}
	
	@Override
	public void loanAmount() {
		System.out.println("The loan amount is: " + loanAmount);
		
	}

	@Override
	public void foreClosure() {
		
		System.out.println("Customer wants foreclosure for amount: " + this.loanAmount);
		
	}
	
}
