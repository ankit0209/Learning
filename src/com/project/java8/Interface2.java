package com.project.java8;

public interface Interface2 {

void method1(String str);
	
	default void log(String str){
		System.out.println("I2 logging::"+str);
}
}
