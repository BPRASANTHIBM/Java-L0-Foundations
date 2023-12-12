package com.day1;

public class InstanceStaticMethod {

	void myMethod1() {
		System.out.println("Instance Method");
	}
	
	static void myMethod2() {
		System.out.println("Static Method");
	}
	
	// inside static block we can't use this keyword 
	
	// local variables can't the static 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceStaticMethod m = new InstanceStaticMethod();
		m.myMethod1(); // obj.methodname
		
		InstanceStaticMethod. myMethod2(); // classname.method name
		
		
	}

}
