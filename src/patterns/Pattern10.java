package patterns;

//Problem: Pattern 7
//Problem link: https://www.geeksforgeeks.org/problems/triangle-pattern-1661718013/1&selectedLang=javascript
//Platform: GeeeksforGeeks
//Difficulty: Basic
//Time Complexity: O(n^2)
//Space Complexity: O(1)

public class Pattern10 {

	public static void printTriangle(int n) {
        for(int i = 1; i<(n*2);i++){
            if(i<=n){
                for(int j = 1; j<=i ; j++){
                System.out.print("* ");
                }
            }
            else{
                for(int j = n - (i-n); j>=1; j--){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		printTriangle(5);
	}

}
