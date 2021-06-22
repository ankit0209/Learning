package com.project.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.project.java8.bean.Employee;

public class StreamList {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee("zak",87,"A"));
		empList.add(new Employee("praveen",99,"B"));
		empList.add(new Employee("rahul",67,"B"));
		empList.add(new Employee("ankit",77,"B"));
		
		System.out.println(empList);
		//Map<String,List<Employee>>emp = empList.stream().filter((x)->x.getEname().equals("ankit")).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		Map<String,List<Employee>>emp = empList.stream().collect(Collectors.groupingBy(Employee::getDept));
		System.out.println(emp);
		//sorting
		Optional<Employee>empe =empList.stream().filter((x)->x.geteName().equals("zak")).findAny();
		empList.stream().sorted(Comparator.comparing(Employee::geteName)).collect(Collectors.toList());
		 empList.stream().map((x)->x.geteName().toUpperCase());
		List<Employee> e2=empList.stream().sorted((x,y)-> x.geteName().compareTo(y.geteName())).collect(Collectors.toList());
		
		List<String> newList= empList.stream().map((x)->x.getDept()).distinct().collect(Collectors.toList());
		
		System.out.println(newList);
	}
}