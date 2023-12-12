package com.day5;

interface sum {
	int a = 3;
	int b = 7;
	void addition();
	
	
}

interface del{
	
	int c = 10;
	int d = 6 ;
	void subration();
}




public class MulInterface implements sum,del {

	public static void main(String[] args) {
		MulInterface m = new MulInterface();
		
		m.addition();
		m.subration();

	}

	@Override
	public void subration() {
		int delete = c - d;
		
		System.out.println("The Deleted value is : "+delete);
		
	}

	@Override
	public void addition() {
		 int Add = a + b;
		 
		 System.out.println("The Addition value is : "+Add);
	}

}
