package com.Aggre;


class length{
	int lng(int n){
		
		return n*n;
		
	}
}

class area{
   length l; // Aggrecation Weak Bond
	int are(int n) {
		l = new length ();
		
		int squre = l.lng(5);
		
		int qube = n * squre ;
		return qube;
	}
	
}


public class Aggrecation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Has-a- Relationship ---- Aggrecation Week Bond
		
		
		area a = new area() ;
		System.out.println(a.are(5));//125
		
	}

}
