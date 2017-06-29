package com.fannie.collections;

import java.util.HashSet;

public class SetExample1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Medha");
		System.out.println(set);
		System.out.println((set.add("Medha")));
		System.out.println((set.add("Medha1")));
		set.add("Santosh");
		set.add("Tina");
		set.add("Lisa");
		set.add("Feldi");
		set.add("Marie");
		set.add("Medha");
		System.out.println(set);
		set.remove("Medha"); //add all will add one collection to another.
		System.out.println(set);
		
		HashSet<String> newSet = new HashSet<String>();
		newSet.addAll(set);
		newSet.add("Carlos");
		System.out.println(newSet);
		
	}
}
