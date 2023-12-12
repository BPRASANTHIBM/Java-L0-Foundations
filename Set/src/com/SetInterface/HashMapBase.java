package com.SetInterface;

import java.util.HashMap;

public class HashMapBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String>map = new HashMap<>();
map.put(1, "Java");
map.put(2, "C");
map.put(10, "Python");// put using add the value
map.put(6, "C#");
System.out.println(map);
map.put(2, "c++");


System.out.println(map);
map.remove(3);  //.remove - using remove the value
System.out.println(map);

System.out.println(map.get(2)); //.get using view /read the value


	}

}
