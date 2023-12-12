package com.day1;


class MobilePhone{
	//Variable
	String brandName;
	float price;
	
	
	//Constructor
	
MobilePhone(String brand,float p){
	brandName = brand;
	price = p;
	
	
}
    //Method
void display() {
	
	System.out.println("Brand Name :" + brandName);
	System.out.println("Price :" + price);
}



}



public class Class2 {

	public static void main(String[] args) {
		

		MobilePhone redmi = new MobilePhone("Redmi",10000.1f);
		redmi.display();
		
		System.out.println("**********************************************");
		
		
		MobilePhone vivo = new MobilePhone("vivo",20000.1f);
		vivo.display();
		
	}

}
