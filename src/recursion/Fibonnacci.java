package recursion;

//Problem: Nth fibonacci number
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(n)

public class Fibonnacci {
	
	public static int nthFibonacci(int n) {
        if(n==0 || n==1) return n;
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println(nthFibonacci(n));
	}

}
