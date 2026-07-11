package capitalOne;

import java.util.HashMap;

public class SubArraySumOptimized {
	public static int subarraySum(int[] nums, int k) {
		int count = 0;
		int currentPrefixSum = 0;

		// HashMap stores: [Prefix Sum -> Number of times it has occurred]
		HashMap<Integer, Integer> prefixSumMap = new HashMap<>();

		// Base case: A prefix sum of 0 has occurred 1 time (handles subarrays starting
		// from index 0)
		prefixSumMap.put(0, 1);

		for (int num : nums) {
			// Update the running cumulative sum
			currentPrefixSum += num;

			// Check if (currentPrefixSum - k) exists in our map
			if (prefixSumMap.containsKey(currentPrefixSum - k)) {
				count += prefixSumMap.get(currentPrefixSum - k);
			}

			// Add/Update the current prefix sum count in the map
			prefixSumMap.put(currentPrefixSum, prefixSumMap.getOrDefault(currentPrefixSum, 0) + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1 };
		int k = 2;
		System.out.println("Total subarrays : " + subarraySum(nums, k)); // Output: 2
	}
}
