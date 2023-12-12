package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MetroApp {
	int BookingTicketNo = 1;
	int FirstClass= 2 ;
	int SecondClass=1;
	int NoOfSeates;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

MetroApp m = new MetroApp();

Scanner sc = new Scanner(System.in);
Map<Integer, String> blue = new HashMap<>();
Map<Integer, String> red = new HashMap<>();

blue.put(1, "Chennai Metro");
blue.put(2, "Guindy");
blue.put(3, "Alvarpet");
blue.put(4, "Ashok pittar");
blue.put(5, "Chennai central");

red.put(1, "Thirsulam");
red.put(2, "Saidapet");
red.put(3, "st.Thomas Mo"
		+ "unt");
red.put(4, "Tambaram");
red.put(5, "Perungalathur");




boolean flag = true ;

while(flag==true) {

System.out.println("Enter the Line of your train whether it is : \n1.BlueLine \n2.RedLine"+"\n Note : You Have to Type only Numeric value");	
	  int c = sc.nextInt();
	
	switch(c) {
	case 1:{
		System.out.println("----------------------You are in Blue Line-----------------------");
		System.out.println();
		
		
		System.out.println("Enter your Destination you want Go :"+"(1, \"Chennai Metro\");\r\n"
				+ "(2, \"Guindy\");\r\n"
				+ "(3, \"Alvarpet\");\r\n"
				+ "(4, \"Ashok pittar\");\r\n"
				+ "(5, \"Chennai central\");\r\n"
				);
		int b = sc.nextInt();
		m.blue(blue,b);
		
		
		break;
		
	}
	case 2:{
		
		System.out.println("----------------------You are in Red Line-----------------------");
		System.out.println();
		
		
		System.out.println("Enter your Destination you want Go :" +"\n(1, \"Thirsulam\")"
				+ "(2, \"Saidapet\")\r\n"
				+ "(3, \"st.Thomas Mount\")\r\n"
				+ "(4, \"Tambaram\")\r\n"
				+ "(5, \"Perungalathur\")");
		int b1 = sc.nextInt();
		m.red(red,b1);
		
		
		
	}
	
	
	
	}
	System.out.println("Do you have continue this booking ? ? ? \n1.y\n2.n");
	char b2 = sc.next().charAt(0);
	if(b2=='n') {
		
		flag=false;
	}
	
}
	
	
	
	}
	
	
/**************************************************Red Line**************************************/	
	
	public void red(Map<Integer, String> red, int b1) {
		// TODO Auto-generated method stub
		System.out.println("Enter the No Of seats you have Book :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int add=0 ;
		    System.out.println("Your Distination is : Chennai airport to --------->"+red.get(b1));              
		
		   // Stages - More than 3 stages it can be charge 10 rs or else 5 rs for extra charges 
//		    if (b1>=3)  {
//			  add = 10;
//		 }
//		 else {
//			  add = 5;
//		 }
		                   
		
		totalPrice(n,add);
		
		booking(n);
	}


/*  ************************************************Blue Line************************************* */

	public void blue (Map<Integer, String> blue,int b1) {
		
		System.out.println("Enter the No Of seats you have Book :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int add = 0;
		    System.out.println("Your Distination is : Chennai airport to --------->"+blue.get(b1));              
//		 if (b1>=3)  {
//			  add = 10;
//		 }
//		 else {
//			  add = 5;
//		 }
		                   
		
		totalPrice(n,add);
		
		booking(n);
		
		
		
		
		
		
	}
	
	public int booking (int n1) {
		int a = BookingTicketNo;
     if (n1>1) {
		for(int i=0;i<n1;i++) {
			System.out.println("The Booking Seats No are :"+ a++);
		}
		
     }
     else
    		System.out.println("The Booking Seats No are :"+ a++);
	
		return a;
		
	}
	
	
	public void totalPrice(int n1, int add1){
		
		int price = 5;
		
		System.out.println("Enter the class \n1.Firstclass \n2.Secondclass");
		Scanner scanner= new Scanner(System.in);
		int o = scanner.nextInt();
		
		
		
		
		
		if(o==1) {
		System.out.println("Your class of Metro Train is :"+"First Class");
		}
		if(o==2)
			System.out.println("Your class of Metro Train is :"+ "Second Class");

//		if(n1>0) {
//			for (int i=0;i<n1;i++) {
//				
//				int x = 0;
//				
//				if(o==1) {   /// for first class passangers
//				 x = 5;
//				}
//				
//				
//				price = price + add1 + x;
//			}
//			System.out.println("The Total amount of Journy :" +price);
//		}
//		else 
		
		int x = 0;	
	    if(o==1) {   /// for first class passangers
		 x = 5;
		}
		
		if(n1>1) {
			
			System.out.println("The Total amount of Journy :" +(price*n1+x*n1));
		}
		else {
			price = 5;
			System.out.println("The Total amount of Journy :" +(price+x*n1));
		}
	}

}
