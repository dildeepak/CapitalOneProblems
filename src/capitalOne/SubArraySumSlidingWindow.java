package capitalOne;

public class SubArraySumSlidingWindow { // Time Complexity O(N) , Space Complexity O(1) 
	public static int subarraySum(int[] nums, int k) {
		int count = 0;
		int sum = 0;
		int left = 0;

		for (int right = 0; right < nums.length; right++) {
			sum += nums[right];

			while (sum > k && left <= right) {
				sum -= nums[left];
				left++;
			}

			// check if we found the match
			if (sum == k) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1 };
		int k = 2;
		System.out.println("Total subarrays : " + subarraySum(nums, k)); // Output: 2
	}
}
