package com.project.java8;

import java.awt.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {

	
	public static void main(String[] args) {
		
		//String str[][] = new String[][] {{"d","g"}};
		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		
		
		Stream<String[]> strem =Arrays.stream(data);
		
		//strem.sorted().collect(Collectors.toList());
		
	strem.flatMap(x->Arrays.stream(x)).forEach(x->System.out.println(x));
	
}
}
