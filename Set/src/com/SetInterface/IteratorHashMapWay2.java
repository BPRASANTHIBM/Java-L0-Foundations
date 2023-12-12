package com.SetInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorHashMapWay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "C");
		map.put(10, "Python");// put using add the value
		map.put(6, "C#");
		System.out.println(map);
		map.put(2, "c++");
		
		
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
