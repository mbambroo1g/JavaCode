package com.fannie.day2.set2;

public class LoanClient {
	public static void main(String[] args) {
		
		//not a good practice if the methods get overridden in child.
//		BankLoan l = new MortgageLoan(200000,300,4500);
//		
//		((MortgageLoan)l).checkCreditScore(300);
//		((MortgageLoan)l).verifyIncome(6500);
//		((MortgageLoan)l).loanAmount();
//		((MortgageLoan)l).repay(1000);
//		((MortgageLoan)l).loanAmount();
//		((MortgageLoan)l).repay(1000);
//		((MortgageLoan)l).loanAmount();
//		((MortgageLoan)l).repay(1000);
//		((MortgageLoan)l).loanAmount();
//		((MortgageLoan)l).repay(1000);
//		l.foreClosure();
//		
//		System.out.println("-------------------------------");
		
		MortgageLoan ml = new MortgageLoan(90000,770,6500);
		ml.checkCreditScore(300);
		ml.verifyIncome(6500);
		ml.loanAmount();
		ml.repay(2000);
		ml.loanAmount();
		ml.repay(2000);
		ml.loanAmount();
		ml.repay(2000);
		ml.loanAmount();
		ml.repay(2000);
		ml.loanAmount();
		ml.repay(2000);
		ml.foreClosure();
	}

}