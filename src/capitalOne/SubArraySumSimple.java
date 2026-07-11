package capitalOne;

public class SubArraySumSimple {
	 public static int subarraySum(int[] nums, int k) {
	        int count = 0;
	        
	        // Try every possible starting point
	        for (int start = 0; start < nums.length; start++) {
	            int currentSum = 0;
	            
	            // Add elements one by one from the starting point
	            for (int end = start; end < nums.length; end++) {
	                currentSum += nums[end];
	                
	                // If the current subarray sum matches k, increment count
	                if (currentSum == k) {
	                    count++;
	                }
	            }
	        }
	        
	        return count;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 1, 1};
	        int k = 2;
	        System.out.println("Total subarrays : " + subarraySum(nums, k)); // Output: 2
	    }
}
