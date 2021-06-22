package com.project.learn;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FirstClass {

	FirstClass(int a){
		System.out.println("this is super constructor");
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Hello World");
		
		String s= "file";
		s="js";
		
		System.out.println(s);
	}
}
