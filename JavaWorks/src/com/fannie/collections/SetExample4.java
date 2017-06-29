package com.fannie.collections;

import java.util.TreeSet;

public class SetExample4 {
	public static void main(String[] args) {
		TreeSet<Park> parks = new TreeSet<Park>();
		
		parks.add(new Park(101, "Frying Pan", "Herndon"));
		parks.add(new Park(102, "Old Ox", "Herndon"));
		parks.add(new Park(102, "Deer Park","Herndon"));
		parks.add(new Park(102, "Old Ox", "Herndon"));
		parks.add(new Park(102, "Old Ox", "Herndon"));
		parks.add(new Park(102, "Old Ox", "Herndon"));
		
		for(Park temp: parks){
			System.out.println(temp+","+temp.hashCode());
		}
	}
}
