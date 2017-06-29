package com.fannie.day2.set2;

import java.util.Arrays;

public class NumberSort {
	public static void main(String[] args) {
		int [] nums = {23,65, 21, 87, 9, 00, 65, 78, 83, 99};
		//String [] strs = {};
		
		for (int temp:nums){
			System.out.println(temp);
		}
		System.out.println("-----------------------------------------");
		Arrays.sort(nums);
		for (int temp:nums){
			System.out.println(temp);
		}
	}

}
