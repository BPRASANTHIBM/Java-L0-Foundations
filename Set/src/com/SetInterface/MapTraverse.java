package com.SetInterface;

import java.util.HashMap;
import java.util.*;
public class MapTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "C");
		map.put(10, "Python");// put using add the value
		map.put(6, "C#");
		System.out.println(map);
		map.put(2, "c++");

		//way-1
		Set<Integer>set = map.keySet();
		System.out.println(set);
		
		Iterator<Integer>it = set.iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("key  :"+key+" value :"+map.get(key));
		}
		
		
		
		System.out.println("***********************************************");
		
		for (Integer i : set) {
			System.out.println("key  :"+ i+"  value :"+map.get(i));
		}
		
	}

}
