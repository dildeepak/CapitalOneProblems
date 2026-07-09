package capitalOne;

import java.util.Arrays;

public class TwoSum_SortedInputArray {

	public static void main(String[] args) {

		int[] nums= {2,7,11,15,23};
		int target = 17;
		
		int[] result = twoSumSorted(nums, target);
		System.out.println(Arrays.toString(result));
	}
		
		
		public static int[] twoSumSorted(int[] nums, int target) {
		int left= 0;
		int right = nums.length-1;
		
		while(left < right) {
			int sum = nums[left] + nums[right];
			
			if(sum == target) {
				return new int[] {left+1,right+1};
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}
		return new int[] {-1,-1};
		 
	}

}
