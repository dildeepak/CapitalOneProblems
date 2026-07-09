package capitalOneOld;

/**
 * Given an array of positive numbers and a positive number ‘k,’
find the maximum sum of any contiguous subarray of size ‘k’.
Example 1:
Input: [2, 1, 5, 1, 3, 2], k=3 
Output: 9
Explanation: Subarray with maximum sum is [5, 1, 3].

Example 2:
Input: [2, 3, 4, 1, 5], k=2 
Output: 7
Explanation: Subarray with maximum sum is [3, 4].
 * @author dilde
 *
 */
public class SubarrayProgram {

	public static void main(String[] args) {
		
		int[] arr= {2, 3, 4, 1, 5};
		int k = 2;
		
		System.out.println(" Sum is " + findSum(arr, k));

	}
	
	static int findSum(int [] arr, int k) {
		int sum=0;
		int result = 0;
		for(int i=0; i<arr.length-k;i++) {
			sum = arr[i]+arr[i+k-2]+arr[i+k-1]; // 5 , 1 , 2
			if(result <= sum) {
				result= sum; 
			}			
		}		
		return result;		
	}
}
