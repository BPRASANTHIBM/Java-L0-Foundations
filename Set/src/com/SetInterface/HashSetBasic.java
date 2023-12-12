package com.SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer>set = new HashSet<Integer> ();

set.add(5);
set.add(8);
set.add(1);
set.add(35);
set.add(2);
set.add(1);
set.add(0);
System.out.println(set);


System.out.println(set);
System.out.println(set.size()); 
System.out.println();

set.forEach(e -> System.out.println(e)); // lamda function 



for (Integer i : set) {  // way-1
	System.out.println(i);
}

System.out.println("-----------------------------------------------------");


Iterator<Integer>it = set.iterator(); //Way-2
while(it.hasNext()) {
	System.out.print(it.next()+" ");
}
	}

}


