package com.Aggre;

import java.util.LinkedList;
import java.util.*;

// Composition is strong bond you assosiate with two of objects
// this type of composition the 2 type of classes are inter-linked
// any one of a class can deleted another one doesn't work


class College { // Using that College into the generic value
	String name ;
	String Address;
	String Staff;
	College (String name , String Address, String Staff){
		this.name=name ;
		this.Address=Address;
		this.Staff = Staff;
	}
	
	
	
}
class University{
	
	private final List<College> colleges;
	
	University(List<College> colleges){ // Catch the values by list values
		this.colleges = colleges;
		
		
			
		}
	List<College>getColleges(){
		return colleges;
	}
	}
	




public class Composition {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<College>colleges = new ArrayList<College>(); 
	
	College c = new College("GKM", "Perungalathur", " Prasanth");
	College c1 = new College("GKM", "Perungalathur","Surya");
	College c3 = new College("GKM", "Perungalathur","Vijay");
	
	
	
		University u = new University (colleges);
		
		List<College>college = u.getColleges(); // return the values get from another list
		college.add(c);
		college.add(c1);
		college.add(c3);
		
//		for (College co : college) {
//			System.out.println(co.name + co.Address);
//		}
		System.out.println("**************College Details Management Application**************");
		System.out.println("Enter the Queries you want ??? "+"\n 1.To get the College Details"
		                                                     +"\n 2.To get the College Address"
				                                              + "\n 3.To Sort the Order");
		Scanner sc = new Scanner (System.in);
		
		int k = sc.nextInt();
		
		switch (k) {
		case 1:{
			
			System.out.println("<----------These are the Colleges in the Database----------------->");
			for (College i : college) {
				System.out.println("College Name :"+i.name);
			}
		}
			
			break;
			
		case 2:{
			

			System.out.println("<----------These are the Colleges Address in the Database----------------->");
			for (College i : college) {
				System.out.println("College Address :"+i.Address);
			}
			
			
		}
		break; 
		
		case 3:{
			System.out.println("<------------Sorted DataBase--------->");
			
//			Collections.sort(college,Collections.reverseOrder());
//			
//			Object arr[]= college.toArray();
//			
//			Arrays.sort(arr);
			for (College i : college) {
			
			System.out.println(i.name+"   "+i.Address);
				
		}
			
//			for (Object j: arr) {
//				System.out.println(arr[(int) j]);
//		}
			
		}
		
		}

		
		}
		
		
	}


