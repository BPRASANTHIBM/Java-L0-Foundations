package com.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingBasic {
	// File Handling is nothing but Handling the Files, like Creating the file , getting the information 
	// from the file, Access the files
	// there are two type  of streams byte stream and Charector Stream
	// there are many Operation can perform in file handling 
	// Ex: 1 ) Creating a file 
	
	
	
	
	

	public static void main(String[] args) {
		
		File f = new File("d:/Prasanth.txt");
		
		try {
			if(f.createNewFile()==true) {
				
				System.out.println("The File is "+f.getName()+ "SuccessFully created");
				
			}
			else 
				System.out.println("The File is not created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
