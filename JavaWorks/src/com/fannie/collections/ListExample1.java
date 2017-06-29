package com.fannie.collections;

import java.util.ArrayList;

//Raw list.
public class ListExample1 {
	@SuppressWarnings({"unchecked","rawtypes"})
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(101);
		list.add("Hello");
		list.add(true);
		list.add(101.2);
		list.add(100000000000L);//Add L for long integer
		list.add(new Object());
		
		for(Object temp :list){
			System.out.println(temp);
		}
		
	}
}
