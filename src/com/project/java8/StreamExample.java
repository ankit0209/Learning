package com.project.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6,7,9,4,3);
		
		int a=list.stream().mapToInt(x->x).sum();
		
		System.out.println(a);
		
		list.stream().mapToInt(x->x).average();
		
		Optional<Integer> optioanl=list.stream().max(Comparator.comparing(Integer::valueOf));
		
		System.out.println(optioanl.get());
	}
}
