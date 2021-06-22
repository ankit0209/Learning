package com.project.problems;

public class Question2 {

    public static void findSequence(String str, String seq){

        int n=str.length();//geeksforgeek for
        int m= seq.length();

        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(str.charAt(i+j)!=seq.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.println(i);
            }
        }

    }
    public static void main (String[]args) {
        String a = "geeksforgeeks";
        String p = "forg";

        findSequence(a,p);
    }
}
