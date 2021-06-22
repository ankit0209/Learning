package com.project.java8;

public class Myclass implements Interface1,Interface2{

	/*
	 * @Override public void method2() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
		System.out.println("own imp");
		
	}
	
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		Interface1.print("abc");
	}
	
	public static void main(String[] args) {
		
		Interface2 interface2= new Myclass();
		
		Interface1 interface1= new Myclass();
		
		
		interface2.method1("");
		interface1.method1("");;
	}

}
