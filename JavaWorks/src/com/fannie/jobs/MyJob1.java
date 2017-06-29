package com.fannie.jobs;

import java.util.ArrayList;
import java.util.List;

public class MyJob1 {
	//shall take a parameter to insert
	public boolean insertEmp(int val){
		if(val == 1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int getNumberOfEmps() {
		//let's say we will read this from the dB.
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 5;
	}	
	
	public List<String> getMyEmps() {
		return new ArrayList<>();
	}
}
