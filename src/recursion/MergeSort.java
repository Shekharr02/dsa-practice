package recursion;

import java.util.Arrays;

public class MergeSort {
	
	public static void merge(int a [], int b [], int arr[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				arr[k++]=a[i++];
			}
			else {
				arr[k++]=b[j++];
			}
		}
		while(i<a.length) arr[k++] = a[i++];
		while(j<b.length) arr[k++] = b[j++];
		
	}
	public static void mergeSort(int [] arr) {
		int n = arr.length;
		if(n==1) return;
		int [] a = new int[n/2];
		int [] b = new int[n -  n/2];
		int idx = 0;
		for(int i = 0; i<a.length;i++) {
			a[i] = arr[idx++];
		}
		for(int j =0;j<b.length;j++) {
			b[j] = arr[idx++];
		}
		mergeSort(a);
		mergeSort(b);
		merge(a,b,arr);
	}

	public static void main(String[] args) {
		int arr [] = {5,2,8,4,1,6,7,3};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
