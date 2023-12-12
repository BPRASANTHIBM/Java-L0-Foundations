package com.mapbasic;

import java.util.HashMap;

public class MapCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "pencil");
		map.put(2, "pen");
		map.put(3, "Computer");
		map.put(5, "Laptop");
		
		System.out.println("The Associate value is "+ map);
		
		System.out.println("The Count Key-Value of a Map is :"+ map.size());
	}

}
