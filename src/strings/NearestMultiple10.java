package strings;

//Problem: Nearest multiple of 10
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/nearest-multiple-of-102437/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

public class NearestMultiple10 {

	public static String roundToNEarest(String s) {
		int a = Integer.parseInt(s);
		if(a%10<=5) a-= a%10;
		else a+= (10- (a%10));
		return ""+a;
	}
	public static void main(String[] args) {
		String s = "16";
		System.out.println(roundToNEarest(s));
	}

}
