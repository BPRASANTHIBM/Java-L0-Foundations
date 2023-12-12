package com.mapbasic;

import java.util.HashMap;
import java.util.*;
public class RemoveAllMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "pencil");
		map.put(2, "pen");
		map.put(3, "Computer");
		map.put(5, "Laptop");
		System.out.println(map);
	
	map.clear();
	System.out.println(map);
		
//		Set<Integer>set = map.keySet();
//		
//		set.forEach(e -> map.remove(e));
//		System.out.println(map);
		
		
	}

}
