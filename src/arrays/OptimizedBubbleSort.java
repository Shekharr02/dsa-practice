package arrays;


import java.util.Arrays;

public class OptimizedBubbleSort {
	public static int [] bubbleSort(int [] arr) {
		boolean swapped;
		for(int i =0;i<arr.length-1;i++) {
			swapped=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}
			}
			if(!swapped) break;
		}
		return arr;
	}
	public static void main(String[] args) {
		int [] arr = {5,-2,6,7,2,0,7,2};
		System.out.println(Arrays.toString(bubbleSort(arr)));
 	}
}

