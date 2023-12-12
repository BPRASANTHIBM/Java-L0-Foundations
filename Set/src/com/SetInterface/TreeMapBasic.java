package com.SetInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String>map = new TreeMap<>(Collections.reverseOrder());// Treeset maintain a predefinely sort in asending order
		//Collections.reverseOrder can reverse the whole Map
		map.put(16, "Java");
		map.put(11, "C");
		map.put(10, "Python");// put using add the value
		map.put(6, "C#");
		
		map.put(2, "c++");
		System.out.println(map);
		System.out.println("____________________________________________________________");
		
		TreeMap<Integer, String>map1 = new TreeMap<>();
		map1.put(16, "Java");
		map1.put(11, "C");
		map1.put(10, "Python");// put using add the value
		map1.put(6, "C#");
		
		map1.put(2, "c++");
		System.out.println(map1);
		
	
		
		
		//Entry - is the container it stores key , value wraps in a single unit;
		// .getKey() - returns key value
		//.getValue() - return Value value
		Set<Entry<Integer,String>> set = map.entrySet();
		
		Iterator<Entry<Integer, String>> entry = set.iterator();
		while(entry.hasNext()) {
			Entry<Integer, String> e = entry.next();
			System.out.println("Key  :"+e.getKey()+"  value  : "+e.getValue());
		}
		
		System.out.println("_______________________________________________________");
		
		
		for (Entry<Integer, String> e1 : set) {
			
			System.out.println("Key  :"+e1.getKey()+"  value  : "+e1.getValue());
			
		}

		
	}

}
