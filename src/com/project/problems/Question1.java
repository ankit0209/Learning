package com.project.problems;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Question1 {

    public static void highestFrequency(int a[]) {
        int frequency = 1;
        int element = 0;
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(a).forEach(x -> {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        });
        for (Map.Entry<Integer, Integer> value : map.entrySet()) {
            if (frequency < value.getValue()) {
                element = value.getKey();
                frequency = value.getValue();
            }
        }
        if (frequency > 1) {
            System.out.println("The Element is " + element + " frequency " + frequency);
        } else {
            System.out.println("All elements are occured once");
        }

    }

    public static void removeDuplicate(int a[]){

       Arrays.stream(a).distinct().forEach(System.out::println);

    }
    public static void findDuplicates(int a[]){
//2,4,2,7,1,3
        Arrays.stream(a).distinct().forEach(System.out::println);

    }

    public static void main(String[] args) {
        int a[] ={2,4,6,7,7,3,7};
        //highestFrequency(a);
        removeDuplicate(a);
    }
}
