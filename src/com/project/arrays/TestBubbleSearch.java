package com.project.arrays;

public class TestBubbleSearch {

    public static int bubbleSearch(int a[],int x){
        // find mid (left and right)
        //mid==x return index
        //mid>x right--
        int l=0;
        int r=a.length-1;//4,3

        while(l<=r){

            int mid= (l+r)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]<x){
                l++;
            } else if(a[mid]>x){
                r--;
            }
        }
        return -1;
    }

    public static void findDuplicate(int a[]){
        //a[]= 2,5,2,3,1,4 replace with negative
        //if any negative exit then duplicate

        for(int i=0;i<a.length;i++) {
            int j= Math.abs(a[i]);
            if(a[j]>0){
                a[j]=-a[j];
            }
            else{
                System.out.println(j);
            }
        }

    }
    public static void main(String[] args) {

        int a[] = {2,4,6,7,9,12,13,14,15,16,17,19,20};
        int b[]= {1,5,2,3,1,4};
        findDuplicate(b);

        System.out.println(bubbleSearch(a,19));

    }
}
