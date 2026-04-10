package patterns;

//Problem: Pattern 7
//Problem link: https://www.geeksforgeeks.org/problems/triangle-pattern-1661492263/1
//Platform: GeeeksforGeeks
//Difficulty: Basic
//Time Complexity: O(n^2)
//Space Complexity: O(1)
public class StarPattern {

	public static void printTriangle(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = i; j < n ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
	public static void main(String[] args) {
		printTriangle(5);
	}

}
