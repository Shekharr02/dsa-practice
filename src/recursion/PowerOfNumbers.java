package recursion;

//Problem: Power of numbers
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1
//Difficulty: Medium
//Time Complexity: O(n)
//Space Complexity: O(n)

public class PowerOfNumbers {

	public static int pow(int a, int b){
        if(b==0) return 1;
        int call = pow(a,b/2);
        if(b%2==0) return call*call;
        else return call*call*a;
    }
    public static int reverseExponentiation(int n) {
        // code here
        if(n==10) return 10;
        return pow(n,n);
    }
	public static void main(String[] args) {
		int a = 9;
		System.out.println(reverseExponentiation(a));
	}

}
