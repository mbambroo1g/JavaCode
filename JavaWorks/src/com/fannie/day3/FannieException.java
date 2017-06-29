package com.fannie.day3;

public class FannieException extends Exception{
	private String msg;
	
	public FannieException(){
		this.msg= "Fanniemae exception called without message.";
	}
	
	public FannieException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "FannieException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "::::::::::"+msg;
	}
	
}
