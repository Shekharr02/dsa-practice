package arrays;

//Problem: Java Arrays | Set 1
//Problem link: https://www.geeksforgeeks.org/problems/java-arrays-set-11354/1
//Platform: GeeeksforGeeks
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

public class ArrayAvg {
	
	public static String average(int arr[]) {
        if(arr==null || arr.length==0) return "0.00";
        double sum = 0.0;
        int n = arr.length;
        for(int i = 0; i<n ; i++){
            sum+=arr[i];
        }
        double avg = sum / n;
        return String.format("%.2f",avg);
    }
	
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5};
		System.out.println(average(arr));
	}
}
