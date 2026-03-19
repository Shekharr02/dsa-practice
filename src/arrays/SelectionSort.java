package arrays;

import java.util.Arrays;

public class SelectionSort {
	
	public static void selectionSort(int arr[]) {
		for(int i =0;i<arr.length-1;i++) {
			int min = Integer.MAX_VALUE;
			int minIdx = -1;
			for(int j = i;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					minIdx = j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[minIdx];
			arr[minIdx]=temp;
		}
	}
	public static void main(String[] args) {
		int arr [] = {5,-2,6,7,2,0,7,2};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
