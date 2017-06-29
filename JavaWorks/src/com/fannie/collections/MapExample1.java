package com.fannie.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample1 {
	public static void main(String[] args) {
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		m.put("Bobby", 2000);
		m.put("Gayatri", 2200);
		m.put("Sunil", 3300);
		m.put("Amara", 4433);
//		System.out.println("Bobby's Balance ->"+m.get("Bobby"));
//		m.put("Bobby", 4000);
//		System.out.println("Bobby's Balance ->"+m.get("Bobby"));//Overwrites instead of rejecting.
//		System.out.println("Amara's Balance ->"+m.get("Amara"));
		
		Set mySet = m.entrySet();
		Iterator itr = mySet.iterator();
		
		while(itr.hasNext()){
			Map.Entry<String,Integer> temp = (Entry<String,Integer>)itr.next();
			System.out.println(temp.getKey()+", "+temp.getValue());
		}
		
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		t.put(5, "Zee");
		t.put(10, "Xavier");
		t.put(1, "Apple");
		t.put(3, "Junior");
		t.put(2, "Fish");
		System.out.println(t);
	}
}
