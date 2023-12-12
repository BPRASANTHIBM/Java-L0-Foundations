package com.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleHandlingMethods {

	public static void main(String[] args) throws IOException {
		
	File f = new File("d://Prashanth.txt");	
	
	try {
		if(f.createNewFile()==true) {
			System.out.println("The file is sucessfully Created     :"+f.getName());
			
		}
		else 
			System.out.println("The file is not created");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	if(f.exists()) {
		
		// getting the original path of file
		System.out.println(" The path of file is "+ f.getAbsolutePath());
		
		//we write a file 
		
		System.out.println(" We can write a file is it true or False ??:" +f.canWrite());
		
		
		//we read a file
		System.out.println(" We can read a file :"+f.canRead());
		
		
		System.out.println(" The leghth of a file :"+f.length());
		
	}
	else {
		System.out.println("The above que are not applicable");
	}
	
	//**************************************************************
	
	
	FileWriter fw = new FileWriter("d://Prashanth.txt");
	
	
	fw.write("Myself prasanth I am the one creating this file");
	 System.out.println(" The String is written in above file");
	
	fw.close();
	
	
	
	
	

	}

}
