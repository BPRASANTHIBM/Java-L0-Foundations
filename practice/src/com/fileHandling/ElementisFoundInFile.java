package com.fileHandling;

import java.io.*;
import java.util.*;

public class ElementisFoundInFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
File f = new File("d:/Prashanth.txt");
		Scanner sc = new Scanner(f) ;
		
		boolean got = false;
		
		while(sc.hasNext()) {
			
			if(sc.next().equals("I")) {
				System.out.println("The searching word i is found in a file ");
				
				got = true;
				break;	
			}
			
		}
		if(got==false) {
			System.out.println("The element is not found");
		}
		
	
	
		
		
	}

}
