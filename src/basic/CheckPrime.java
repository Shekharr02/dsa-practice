package basic;

//Problem: Check if the given number is prime number
//Problem link: https://www.geeksforgeeks.org/problems/prime-number2314/1
//Platform: GeeeksforGeeks
//Difficulty: Easy
//Time Complexity: O(sqrt(n))
//Space Complexity: O(1)

public class CheckPrime {

	public static boolean isPrime(int n) {
        // code here
        if( n == 1 ) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(17));
	}

}
