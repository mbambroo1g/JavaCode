package com.fannie.collections;

import java.util.LinkedList;
import java.util.Vector;

public class ListExample3 {
	public static void main(String[] args) {
		
		//Vector<String> list = new Vector<String>();
		//Vector<String> list = new Vector<String>(5);//Set capacity to 5
		Vector<String> list = new Vector<String>(5,2);//Set capacity to 5 and increase by 2.
		System.out.println("Size: " +list.size());
		System.out.println("Capacity: "+list.capacity());//Does not exist for ArrayList.
		
		list.add("Surya");
		list.add("Masood");
		list.add("Sandhya");
		list.add("Hemalata");
		list.add("Kapoora");
		list.add("Anjali");
		list.add("Pichku");
		list.add("Nitin");
		list.add("Karan");
		list.add("Tom");
		list.add("Tyler");
	
		System.out.println("After - Size: " +list.size());
		System.out.println("After - Capacity: "+list.capacity());//Does not exist for ArrayList.
		
		list.remove(5);
		
		System.out.println("After Remove- Size: " +list.size());
		System.out.println("After Remove- Capacity: "+list.capacity());//Does not exist for ArrayList.
		
		//For transaction based applications, 
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Tom");
		list1.add("Jerry");
		list1.addFirst("Tweety");
		list1.addLast("Sylvestor");
		list1.add("Mickey");
		
		System.out.println(list1);
	}
	
}
