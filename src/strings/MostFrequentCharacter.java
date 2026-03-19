package strings;


//Problem: Most Frequent character
//Platform: GeeksforGeeks 
//Problem Link: https://www.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1
//Difficulty: Easy
//Time Complexity: O(n)
//Space Complexity: O(1)


public class MostFrequentCharacter {

	public static char getMaxOccuringChar(String s) {
        // code here
        int freq [] = new int [26];
        for(int i = 0;i< s.length();i++){
            freq[s.charAt(i)-97]++;
        }
        int maxFreq = 0;
        char ans = s.charAt(0);
        for(int i =0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                ans = (char)(i+97);
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "output";
		System.out.println(getMaxOccuringChar(s));
	}

}
