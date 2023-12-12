package int2ROm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Int2Rom {
public static void main (String args[]) {
	int arr[] = {1000,900,500,400,100,50,40,10,9,4,1}; 
String arr1[] = {"M","CM","D","CD","C","L","XL","X","V","IV","I"};
//Map<Integer, String>map= new HashMap<>();
//map.put(1000, "M");
//map.put(900, "CM");
//map.put(500, "D");
//map.put(400, "CD");
//map.put(100, "C");
//map.put(50, "L");
//map.put(40, "XL");
//map.put(10, "X");
//map.put(9, "V");
//map.put(4, "IV");
//map.put(1, "I");
Scanner sc = new Scanner(System.in);
System.out.println("Enter the conversion Integer value");
int n = sc.nextInt();

String sum = "";
try {
	for (int i = 0; i <= arr1.length; i++) {
		while (n >= arr[i]) {
			sum = sum + arr1[i];
			n = n - arr[i];
		}
	} 
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
System.out.println(sum);	
}
}




	


