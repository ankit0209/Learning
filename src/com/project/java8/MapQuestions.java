package com.project.java8;

import com.project.java8.bean.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapQuestions {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        //TODO sort based on key and save in new map
        //entrySet-stream-sorted-map.entry.com
        map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue,newValue)->oldValue, LinkedHashMap::new))
                .forEach((k,v)->System.out.println("key is "+k+" value is "+v));

        Map<Integer,String> finalMap1 = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.<Integer,String>comparingByValue().reversed())
                .forEachOrdered(e->finalMap1.put(e.getKey(),e.getValue()));
        finalMap1.forEach((k,v)->System.out.println("Finalkey is "+k+" Finalvalue is "+v));

        Map<Integer,String> finalMap2 = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(e->finalMap2.put(e.getKey(),e.getValue()));
        System.out.println("This is final map 2 "+finalMap2);





        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Kartik",20,"HR"));
        employees.add(new Employee("Ankt",12,"HR"));
        employees.add(new Employee("Chetan",30,"IT"));
        employees.add(new Employee("Sachin",22,"Asset"));
        employees.add(new Employee("Golu",11,"IT"));

        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya","almonds");

        //TODO get list of Eemployee As key of dept
        Map<String,List<Employee>> mapExaample=employees.stream().collect(Collectors.groupingBy(Employee::getDept));
        //System.out.println(mapExaample);

        //TODO count in given lits
        Map<String,Long> countList=items.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println(countList);
        //TODO Distinct a list
       List<String> distinctItems=items.stream().distinct().collect(Collectors.toList());
        //TODO Sort a list
        List<String>SortedItems=items.stream().sorted().collect(Collectors.toList());
        //TODO java 7Collections.sort(items);
        List<Employee> sortedEmployee=employees.stream().sorted(Comparator.comparing(employee -> employee.geteName())).collect(Collectors.toList());




        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        countList.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

    }
}
