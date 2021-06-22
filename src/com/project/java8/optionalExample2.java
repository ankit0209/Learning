package com.project.java8;

import java.util.Optional;

public class optionalExample2 {
	

	String str[] = new String[] {"abhi","akash","aditya",null};
	
	Optional<String> str1 = Optional.ofNullable(str[3]);
	Optional<String> str2 = Optional.of(str[3]);
	
	public String check2() {
		System.out.println("jj");
		return "working";
	}
	
	public String check() {
		
		
		return str1.orElseGet(()->check2());
	}
	
	
	public static void main(String[] args) {
		optionalExample2 wx = new optionalExample2();
		wx.check();
		
		
	}
}
