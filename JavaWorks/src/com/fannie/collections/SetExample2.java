package com.fannie.collections;

import java.util.HashSet;

import javax.net.ssl.HandshakeCompletedEvent;

public class SetExample2 {
	public static void main(String[] args) {
		HashSet<Park> parks = new HashSet<Park>();
		
		parks.add(new Park(101, "Frying Pan", "Herndon"));
		parks.add(new Park(102, "Old Ox", "Herndon"));
		parks.add(new Park(102, "Deer Park","Herndon"));
		parks.add(new Park(102, "Old Ox", "Herndon"));
		parks.add(new Park(102, "Old Ox", "Herndon"));
		parks.add(new Park(102, "Old Ox", "Herndon"));
		//Conceptually set does not allow duplicates but in this case, 
		//this is a user object and java doesn't know what to do with it.
		
		for(Park temp:parks){
			System.out.println(temp+","+temp.hashCode());
		}
		
	}
}
