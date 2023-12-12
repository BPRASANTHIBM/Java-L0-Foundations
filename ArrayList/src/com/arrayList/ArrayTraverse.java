package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>list = new ArrayList<Integer>();
list.add(20);
list.add(45);
list.add(85);
list.add(34);
list.add(11);

System.out.println(list);
System.out.println();
//way-1
for(int i=0; i<list.size();i++) {
	System.out.println(list.get(i));
}
System.out.println();
//way-2
for (Integer i : list) {
	System.out.println(i);
}
System.out.println();
//way-3
Iterator <Integer> it = list.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}


	}

}


