package arrays;

public class SecondLargest {

	public static int getSecondLargest(int[] arr) {
        // code here
        int largest = -1;
        int secondLargest = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }
            if(arr[i] < largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
	public static void main(String[] args) {
		
		int arr [] = {28708,19451,935,28892,2242,3570,231};
		System.out.println(getSecondLargest(arr));
	}

}
