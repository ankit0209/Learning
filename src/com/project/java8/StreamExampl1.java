package com.project.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExampl1 {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(new Integer[] {2,5,88,44,3,90});
	List<String> lis4t = Arrays.asList("kfk","fk");
	
	
	
	list.stream().filter(x->x>10).mapToInt(i->i).sum();
	
	System.out.println(list);
	
	// first way to create stream using array
	
	Stream<Integer> stream = Stream.of(1,2,4,6);
	
	Stream<Integer> stream1 = Arrays.stream(new Integer[] {2,5,88,44,3,90});
	
	Integer array[] = new Integer [] {2,5,88,44,3,90};
	
	Stream<Integer> stream3 = Stream.of(array);
	
	Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Aksh","Ankit");
	
	Optional<String> naame=names4.filter(x->x.startsWith("A")).findFirst();
	
	if(naame.isPresent()) {
		System.out.println(naame.get());
	}
}
	
	
	
}
