package com.learning.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = new int[]{15,6,3,2,10,7};
		insertionSort(array);
		for(int i = 0; i<array.length;i++){
			System.out.println(array[i]);	
		}
	}
	
	public static int[] insertionSort(int[] input) {

		int temp;
		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					temp = input[j];
					input[j] = input[j - 1];
					input[j - 1] = temp;
				}
			}
		}
		return input;
	}
	
}
