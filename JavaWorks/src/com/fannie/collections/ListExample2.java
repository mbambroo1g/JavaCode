package com.fannie.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample2 {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Medha");
		list.add("Amara");
		list.add("Tatha");
		
		System.out.println(list);
		System.out.println("Number of elements: " + list.size());
		list.add(2,"Amchu");
		list.remove(0);
		System.out.println(list);
		list.add("Medha1");
		list.add("Medha2");
		list.add("Medha3");
		list.add("Medha4");
		
		List<String> newList = list.subList(3,list.size());
		System.out.println("new list ->" + newList);
		
//		for(String temp: list){
//			System.out.println(temp);
//		}
		
//Iterator<String> itr = list.iterator();
		//while is always faster than for, but is not used often. for each is converted to while. 
		//for each is internally converted to while. 
//		
//		while(itr.hasNext()){
//			System.out.println("Element Value is: "+itr.next());
//}
	}
}
