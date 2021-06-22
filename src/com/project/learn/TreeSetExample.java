package com.project.learn;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TreeSetExample {
	public static void main(String[] args) {
		
		Set s1 = new TreeSet<>();
		
		s1.add("ankit");
		s1.add("kartik");
		s1.add("chetan");
		
		
		s1.stream().forEach(System.out::println);
		
		 Map<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");
		   
		   map.forEach((k,v)->System.out.println("Key "+k+"value"+v));
		   
		   map.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByValue().reversed()).forEach(System.out::println);
		   Map<Integer, String> result= map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(
				   Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		   result.forEach((k,v)->System.out.println("Key "+k+"value"+v));
	}

}
