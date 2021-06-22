package com.project.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ArraySum {

    public static void findPair(int a[]){

        Arrays.sort(a);

        int l=0;
        int r=a.length-1;

        for (int i=0;i<a.length;i++){
            int sum=a[l]+a[r];
            if(sum==0){
                System.out.println("The pair is "+a[l]+""+a[r]);
               // return;
            }
            else if(sum>0){
                r--;
            }else if(sum<0){
                l++;
            }
        }
    }

    public static void checkPair(int a[],int sum){
        HashSet set = new HashSet();
        for(int i=0;i<a.length;i++){
            int temp = sum-a[i];
            if(set.contains(temp)){
                System.out.println("For Sum pair is "+temp+" "+a[i]);
            }
            set.add(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[] ={2,5,3,-2,4,-4,1};
        checkPair(a,0);
        //-5,-2,1,2,3,4,5
    }
}
