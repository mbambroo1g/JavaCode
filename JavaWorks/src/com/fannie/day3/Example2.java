package com.fannie.day3;

public class Example2 {
	public static void checkName(String name) throws FannieException {
		if(name.length()<3){
			throw new FannieException("Sorry, the name is too small.");
		}
		
	}
	public static void checkCreditScore(int creditScore, String name) throws RuntimeException,FannieException,Exception{
		try{
			checkName(name);
		}
		catch(FannieException re){ //why is this an issue when i use FannieException????
			throw new FannieException("Sorry Loan processing is not done because "+ name +" is too short.");
			//throw new FannieException();
		}
		if(creditScore<400){
			//loan cannot be processed
			throw new FannieException("Sorry, "+name+"! You do not qualify for the loan!");
			//throw new FannieException();
		}
		else if(creditScore >=400 && creditScore < 600){
			throw new RuntimeException("Let's wait for another 3 months before we make a decision.");
		}
		else
			System.out.println("Congratulations, "+name+ "! You qualify for the loan.");
	}
	public static void main(String[] args) {
		try{
		checkCreditScore(700, "Ty");
		}
		catch(RuntimeException re){
			System.out.println(re.getMessage());
		}
		catch(FannieException fe){
			System.out.println(fe.getMessage());
		}
		catch(Exception e){
			e.printStackTrace();
			//System.out.println(e);
		}
	}
}