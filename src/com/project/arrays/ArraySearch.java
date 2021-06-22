package com.project.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ArraySearch {
public static int search(int a[] ,int b){
    int l=0;
    int r=a.length-1;

    while(l<=r){//l=3,r=5,
        int mid =(l+r)/2;
        System.out.println("mid "+mid);
        if(a[mid]==b)return mid;
        else if(a[mid]>b){
            r=mid-1;
        }
        else {
            l=mid+1;
        }
    }
    return -1;
}
    public static void print(int a[]){
        Arrays.stream(a).forEach(System.out::println);
    }

    public static int occurance(int a[],int b){
        HashSet set = new HashSet();
        set.add(b);
        for(int i=0;i<a.length;i++){
            if(set.contains(a[i])){
                return i;
            }
            else {
                set.add(a[i]);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {4,3,7,1,5,8};
        //1,3,4,5,7,8
        //Arrays.sort(a);
        System.out.println(occurance(a,7));
        //System.out.println(search(a,5));
    }
}
