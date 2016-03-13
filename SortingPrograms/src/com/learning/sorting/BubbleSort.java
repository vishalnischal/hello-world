package com.learning.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[]{15,6,3,2,10,7};
//		int[] array = new int[]{2,3,6,7,10,15};
		 bubbleSort(array);
		for(int i = 0; i<array.length;i++){
			System.out.println(array[i]);	
		}
		
		
		
	}
	
	public static int[] bubbleSort(int[] array){
		boolean swapped = true;
		for(int j=0;j<array.length && swapped;j++){	
			for(int i = 1 ; i<=array.length-j-1; i++){
				swapped=false;
				int temp = 0;
				//System.out.println(j+"--"+array[i-1]);
				if(array[i-1]>array[i]){
					temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
					swapped=true;
				}
			}
		}	
		return array;
	}

}