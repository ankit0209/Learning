package com.project.learn;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBasicExample {
	public static void main(String[] args) {
		
		System.out.println(IntStream.of(1,2,3,4,5,6).count());
		//IntStream.of(1,2,3,4,5,6).distinct().collect(Collectors.toList())
		
		Collection<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
		 
		// Get collection without duplicate i.e. distinct only
		List<String> distinctElements = list.stream()
		                        .distinct()
		                        .collect(Collectors.toList());
		
		List<String> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());
		
		System.out.println(distinctElements);
		
		List<String> anymatch = list.stream()
                .filter(x->x.equals("A"))
                .collect(Collectors.toList());
		 Map<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");
		   
		   Map<Integer,String> sortedmap=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).
		   collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		   sortedmap.forEach((k,v)->System.out.println("Key "+k+"value"+v));
		
	}

}
