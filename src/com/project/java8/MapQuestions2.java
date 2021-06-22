package com.project.java8;

import com.project.java8.bean.Student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapQuestions2 {
    public static void main(String[] args) {

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,new Student("Kartik",233));
        studentMap.put(2,new Student("Ankush",300));
        studentMap.put(3,new Student("Chetan",120));
        studentMap.put(4,new Student("Golu",400));
        studentMap.put(5,new Student("Pandey",100));

        Map<Integer, Student> newstudentMap = new HashMap<>();

        studentMap.entrySet().stream().forEachOrdered(map->System.out.println(map.getValue()));

        studentMap.entrySet().stream()
                .filter(map->map.getValue().getMarks()>200).forEachOrdered(e->newstudentMap.put(e.getKey(),e.getValue()));
        studentMap.entrySet().stream()
                .filter(map->map.getValue().getMarks()>200).collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));
       //comparing by value
        studentMap.entrySet().stream().sorted(Map.Entry.<Integer,Student>comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new)).forEach((k,v)->System.out.println("key is "+k+" value is "+v));;




    }
}
