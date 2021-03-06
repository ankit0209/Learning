package com.project.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> map= new HashMap<>();
		
		
		
		map.put("z", 10);
        map.put("b", 5);
        map.put("a", 6);
        map.put("c", 20);
        map.put("d", 1);
        map.put("e", 7);
        map.put("y", 8);
        map.put("n", 99);
        map.put("g", 50);
        map.put("m", 2);
        map.put("f", 9);
		
		System.out.println(map);
		Map<String,Integer> map1= map.entrySet().stream().
				sorted(Map.Entry.comparingByValue()).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		
		
	System.out.println(map);
	
	System.out.println(map1);
	}
}
