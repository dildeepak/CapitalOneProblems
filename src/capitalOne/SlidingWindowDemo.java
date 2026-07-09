package capitalOne;

public class SlidingWindowDemo {

	public static void main(String[] args) {

		int[] arr= {2,1,5,1,3,2};
		int k=3;
		
		System.out.println(" the max sum is " + maxSumSubarray(arr, k));
	}

	private static int maxSumSubarray(int[] arr, int k) {
		
		if(arr == null || arr.length < k) {
			throw new IllegalArgumentException("Invalid input");
		}
		int windowSum=0;
		int maxSum=0;
		
		//step 1: calculate the sum of first window
		for(int i=0;i<k;i++) {
			windowSum += arr[i];
		}
		maxSum = windowSum;
		
		//Step 2: Slide the window
		for(int right =k;right<arr.length;right++) {
			windowSum = windowSum - arr[right -k] + arr[right];
			maxSum = Math.max(maxSum, windowSum);
		}
		
		return maxSum;
	}

}
