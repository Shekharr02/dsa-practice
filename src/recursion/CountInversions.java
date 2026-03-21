package recursion;

//Problem: Count Inversios
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
//Difficulty: Medium
//Time Complexity: O(n log n)
//Space Complexity: O(n)
public class CountInversions {

	private static int count;
    static int inversionCount(int arr[]) {
        count = 0;
        mergeSort(arr);
        return count;
    }
    
    public static void merge(int a [], int b [], int arr[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[j]) {
				arr[k++]=a[i++];
			}
			else {
			    count+=(a.length-i);
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
		int[] arr = {2, 4, 1, 3, 5};
		System.out.println(inversionCount(arr));
	}

}
