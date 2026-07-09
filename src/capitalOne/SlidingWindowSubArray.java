package capitalOne;

public class SlidingWindowSubArray {

	public static void main(String[] args) {

		int[] arr= {2,3,1,2,4,3};
		int target = 7;
		
		System.out.println(" the minimum lenght is " + minSubArrLength(arr, target));
	}

	private static int minSubArrLength(int[] arr, int target) {

		int left = 0;
		int windowSum = 0;
		int minLength=Integer.MAX_VALUE;
		
		for(int right=0;right<arr.length;right++) {
			windowSum +=arr[right];
		
		
		while(windowSum >= target) {
			minLength = Math.min(minLength, right-left+1);
			windowSum -= arr[left];
			left++;
		}
		}
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}

}
