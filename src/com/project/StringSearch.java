package com.project;

import java.util.Arrays;

public class StringSearch {
    public static void pattern(String a, String p) {

        int m = p.length();//for
        int n = a.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (p.charAt(j) != a.charAt(i + j)) {
                    break;
                }
            }
            if (j == m) {
                System.out.println(i);
            }
        }

    }

    static final int CHAR = 256;

    static boolean areSame(int CT[], int CP[]) {
        for (int i = 0; i < CHAR; i++) {
            if (CT[i] != CP[i]) return false;
        }
        return true;
    }

    static boolean isPresent(String txt, String pat) {
        int[] CT = new int[CHAR];
        int[] CP = new int[CHAR];
        for (int i = 0; i < pat.length(); i++) {
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }
        for (int i = pat.length(); i < txt.length(); i++) {
            if (areSame(CT, CP)) return true;
            CT[txt.charAt(i)]++;
            CT[txt.charAt(i - pat.length())]--;
        }
        return false;


    }
    public static void print(int[]a) {
        Arrays.stream(a).forEach(System.out::println);
    }

        public static void main (String[]args){
        String a = "geeksforgeeks";
        String p = "forg";
      /*  int[] CT = new int[5];
        CT[0]=CT[0]+1;
        print(CT);*/
        //isPresent(a,p);
        pattern(a, p);

    }
}

