package com.project.learn;

public class ArrayWithZero {

	static void findZero(int array[], int n) {

		int count = 0;

		for (int i = 0; i < n; i++) {

			if (array[i] != 0) {
				array[count] = array[i];
				count++;
			}

		}

		while (count < n) {

			array[count++] = 0;
		}
	}
	
	static void reverseArray(int array[], int n) {
		 
		int temp =0;
		
		for(int i=0;i<n/2;i++) {
			
			temp= array[i];
			array[i] = array[n-i-1];
			array[n-i-1]=temp;
			
		}
	}
	
	static void roateArray(int array[], int d, int n) {
		
		int temp[] = new int[d];
	
		for(int i=0;i<=d;i++) {
			
			temp[i]=array[i];
		}
		
	}

	static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int a[] = new int[] { 2, 4, 0, 6, 0, 5 };
		int b[] = new int[] { 1, 2, 3, 4, 6, 5 };
		ArrayWithZero.findZero(a, a.length);
		
		
		ArrayWithZero.reverseArray(b, b.length);
		//ArrayWithZero.printArray(b);
		

		ArrayWithZero.printArray(a);

	}
}
