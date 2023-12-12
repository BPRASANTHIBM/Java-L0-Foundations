package com.bookMyShow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;

class backend {

	public void mySql(int i, String s) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/bookmyshow";
		String user = "root";
		String Pass = "root";

		String Query = "insert into bms values (?,?)";

		Connection con = DriverManager.getConnection(url, user, Pass);

		PreparedStatement pst = con.prepareStatement(Query);

		pst.setInt(1, i);
		pst.setString(2, s);

		int row = pst.executeUpdate();

		// System.out.println("jdbc working correct "+row);

	}

}

public class BookMyShow {

	static Scanner sc = new Scanner(System.in);
	static int bookingId;
	static int cost = 150;
	static int price;
	static Map<Integer, String> m = new HashMap<>(); // Search the person

	public static void main(String[] args) throws SQLException {

		boolean loop = true;

		while (loop) {
			System.out.println("***************Book My Show Application****************");

			System.out.println("Enter your choice for Booking ???");

			System.out.println("1.Add Ticket Booking\n2.Delete Tickets\n3.Check Availabiliy\n4.Quit      ");

			// Queue<String> q = new PriorityQueue<String>();

//	         int arr[] = new int[25];// store values

			int c = sc.nextInt();

			switch (c) {
			case 1:

				Integer d = AddTicket(m);

				boolean Result = d.equals(1);

				if (Result) {

					System.out.println("**************Your Tiket Succesfully Booked****************");

					System.out.println("_________Come Back To Sathiyam Cinimas, Enjoy your snacks__________");
				}

				else {
					System.out.println("*****The Tickets are Booked,Let me Try Again Later*******");
				}

				break;

			case 2:
				
				Integer d1 = DeleteTicket(m);
				break;
			default:
				break;
			}
			System.out.println("Do you want to continue the application??? , choose \n1.Y\n2.N");

			String d0 = sc.next();

			if (d0.compareTo("N") == 0) {
				loop = false;

			}

		}

	}

	public static Integer DeleteTicket(Map<Integer, String> m) {
		System.out.println(m);
		System.out.println("Do you want to delete your ticket ??? Y/N");

		String c = sc.next();

		if (c.compareTo("N") == 0) {
			// add while loop true
		} else {

			System.out.println("Enter how many tickets you want to delete ???");

			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {

				System.out.println("Enter you Booking Id : 111XX");
				int Int = sc.nextInt();

				System.out.println("Enter you Booking Name :");

				String name = sc.next();

				Set<Entry<Integer, String>> set = m.entrySet();

				Iterator<Entry<Integer, String>> it = set.iterator();
//	        		    System.out.println(set);

				while (it.hasNext()) {
					Entry<Integer, String> e = it.next();

					if (e.getValue().equals(name)) {
						m.remove(Int, name);
						
					
						System.out.println("***Your Ticket Has been deleted***");
					} else {
						System.out.println("***Enter the Vaild entry details***");
					}

				}

//	 	        	  String check =  m.remove(del);
//	 	        	  
//	 	        	  if (check == del ) {
//	 	        		  
//	 	        		  System.out.println("");
//	 	        		  
//	 	        	  }

				// System.out.println("******Tickets Deleted Successfully*********");

			}

		}

		return 2;
	}

	public static int AddTicket(Map<Integer, String> m) throws SQLException {

		backend be = new backend();

		System.out.println("Enter the how many tickets you want to book???");

		int n = sc.nextInt(); // get value the ticket to user

//		for(int i = 1; i<n ;i++) {
//			
//		   int add = arr1[i];
//		// Store the values
//				
//		}

		for (int i = 1; i <= n; i++) {

			System.out.println("enter the persons name ???");

			String s = sc.next(); // adding strings

			be.mySql(i, s); // backend call

			price = cost * i; // calculating price

			m.put(i, s);

		}

		System.out.println("******Your Booked Tickets Details Are Below**********");

		for (int i = 1; i <= n; i++) {

			bookingId++; // generate codes

			System.out.println(i + "   " + m.get(i) + "    " + "BookingCode  : 111" + bookingId);

		}
		System.out.println("==========================================================");
		System.out.println("Total Amount of Booking is : " + price);
		System.out.println("==========================================================");

		Integer avl = (25 - n); // availability of seats

		if (avl.equals(0)) {
			System.out.println("---You Have Reach Out of the Limit , Booking Full---");
		}

		System.out.println("\n Available Seats are : " + avl);

		return 1;

	}

}
