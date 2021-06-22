package com.project.java8.bean;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[][] A) {
        int columns = A[0].length;
        int rows = A.length;
        int AddRowsAbove = 0;
        int AddRowsBelow = 0;
        int AddcolLeft = 0;
        int AddColRight = 0;

        int equilibrium = 0;

        for( int i = 0; i < rows; i++  ) {
            for (int j = 0; j < columns; j++) {
                AddRowsBelow = getsumofRows(i,A);
                AddRowsAbove = getSumUpper(i,A);
                AddcolLeft = getcollet(j,A);
                AddColRight = getcolrigh(j,A);
                if(AddRowsAbove == AddRowsBelow && AddcolLeft == AddColRight) {
                    equilibrium++;
                }
                int x = 2;
                x+=2;
            }
        }
        return equilibrium;
    }public static int getsumofRows(int rowNum,int[][] matrix) {
        int columns = matrix[0].length;
        int rows = matrix.length;
        int sumBelow = 0;
        for( int i = rowNum; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if((i+1) < rows){
                    sumBelow += matrix[i + 1][j];
                }
            }
        }

        return sumBelow;
    }

    public static int getcolrigh(int column,int[][] matrix) {
        int columns = matrix[0].length;
        int rows = matrix.length;
        int sumBelow = 0;
        for (int j = column; j <= columns; j++) {
            for( int i = 0; i < rows; i++) {
                if((j+1) < columns){
                    sumBelow += matrix[i][j + 1];
                }
            }
        }
        return sumBelow;
    }

    public static int getcollet(int column,int[][] matrix) {
        //int columns = matrix[0].length;
        int rows = matrix.length;
        int sumBelow = 0;
        for (int j = column; j >= 0; j--) {
            for( int i = 0; i < rows; i++) {
                if((j-1) >= 0){
                    sumBelow += matrix[i][j - 1];
                }
            }
        }
        return sumBelow;
    }

    public static int getSumUpper(int rowNum,int[][] matrix) {
        int columns = matrix[0].length;
        //int rows = matrix.length;
        int sumBelow = 0;
        for( int i = rowNum; i >= 0; i--) {
            for (int j = 0; j < columns; j++) {
                if((i-1) >= 0){
                    sumBelow += matrix[i - 1][j];
                }
            }
        }

        return sumBelow;

    }
}

