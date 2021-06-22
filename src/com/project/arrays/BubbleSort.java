package com.project.arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int a[]){
        int temp;
        boolean swap = false;
        for(int i =0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false)break;
        }
    }
    public static void selectionSort(int a[]){
        int temp;
        for(int i=0;i<a.length-1;i++){
            int min_idx=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min_idx]){
                   min_idx=j;
                }
            }
            temp=a[i];
            a[i]=a[min_idx];
            a[min_idx]=temp;

        }
    }
    public static void print(int a[]){
        Arrays.stream(a).forEach(System.out::println);
    }
    public static void main(String[] args) {
        int a[] = {4,3,7,1,5,8};
        //sort(a);
        selectionSort(a);
        print(a);
    }
}
