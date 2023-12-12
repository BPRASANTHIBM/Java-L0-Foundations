package com.fileHandling;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File f = new File ("d:\\Behavioural & Communication.txt");
		
		Scanner sc = new Scanner (f);
		
		while(sc.hasNextLine()) {
			
//			Scanner dt = new Scanner (System );
			
			String str = sc.next();
			
			System.out.println(str+" ");
			
		}
		
		sc.close();
		
		
	}

}
