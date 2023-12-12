package com.mapbasic;

import java.util.HashMap;
import java.util.Set;

public class KeyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "pencil");
		map.put(2, "pen");
		map.put(3, "Computer");
		map.put(5, "Laptop");
		
		System.out.println("The Associate value is "+ map);
		
//		Set<Integer>set = map.keySet();
//		System.out.println(set);
		
		
		if(map.containsKey(3)) {
			System.out.println("The Key-Value of a map Contains in the HashMap");
		}
		else
			System.out.println("The Value is Not contains in the HashMap");
	}

}
