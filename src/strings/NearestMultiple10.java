package strings;

//Problem: Nearest multiple of 10
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/nearest-multiple-of-102437/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)

public class NearestMultiple10 {

	public static String roundToNEarest(String s) {
		int n = s.length();
		char [] chars = s.toCharArray();
		
		if(chars[n-1]=='0') return new String(chars);
		if(chars[n-1] - '0' <= 5) {
			chars[n-1] = '0';
			return new String(chars);
		}
		
		int carry = 1;
		chars[n-1]='0';
		for(int i = n-2;i>=0;i--) {
			if(chars[i]+'0'+ carry == 10) {
				chars[i]='0';
			}
			else {
				chars[i] += '0' ;
				return new String(chars);
			}
		}
		return "";
		
	}
	public static void main(String[] args) {
	
		String s = "199997";
		System.out.println(roundToNEarest(s));
	}

}
