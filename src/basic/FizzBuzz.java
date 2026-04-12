package basic;

//Problem: The FizzBuzz Program
//Problem link: https://www.geeksforgeeks.org/problems/the-fizzbuzz-program/1
//Platform: GeeeksforGeeks
//Difficulty: Easy
//Time Complexity: O(1)
//Space Complexity: O(1)

public class FizzBuzz {

	public static void fizzBuzz(int number) {
        if(number%3 == 0 && number%5==0) {
            System.out.println("FizzBuzz");
        }
        else if(number%3==0){
            System.out.println("Fizz");
        }
        else if(number%5 == 0){
            System.out.println("Buzz");
        }
        else System.out.println(number);
    }
	
	public static void main(String[] args) {
		fizzBuzz(15);
	}

}
