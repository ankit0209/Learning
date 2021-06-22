package com.project.java8;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
		String str [] = new String[5];
		
		str[2]="name";
		
		Optional<String> optional = Optional.ofNullable(str[2]);
		
		Optional<String> optional1 = Optional.of(str[1]);
		
		if(optional.isPresent()) {
			
			String str1 = str[2].toLowerCase();
			System.out.println(optional.get());
		}
		else {
			
			System.out.println("nullable");
		}
	}
}
