package capitalOneOld;

import java.util.Arrays;

public class TwoSumSimple {

	public static void main(String[] args) {

		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result=twoSum(nums, target);
		System.out.println(Arrays.toString(result));

	}
	
	/**
	 * It will take On2 time as loop is iterating twice
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[]nums, int target) {
		int n=nums.length;
		
		for(int i=0;i<n;i++) { // starting outer loop from 0 to check the first element
			for(int j=i+1;j<n;j++) { // starting inner loop from i+1 to check subsequent letters
				if(nums[i] + nums[j] == target) {
					//return new int[] {i,j}; // to display the index
					return new int[] {nums[i],nums[j]};// to display the values
				}
			}
		}
		return new int[] {};
		
	}

}
