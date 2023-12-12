package com.mapbasic;

import java.util.HashMap;
import java.util.Scanner;

public class MapGetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "pencil");
		map.put(2, "pen");
		map.put(3, "Computer");
		map.put(5, "Laptop");
		
		System.out.println("The Associate value is "+ map);
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the key value of search :");
		int key = sc.nextInt();
		
		
	
		System.out.println(map.get(key));
		
	}

}
