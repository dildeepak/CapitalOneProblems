package leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RotateArray {

	public static void main(String[] args) {
		
		int k=3;
		int[] nums= {1,2,3,4,5,6,7};
		//System.out.println(rotate(nums,k));

	}
	static void rotate(int[] nums, int k) {
        
		/*
		 * Collections.reverse(Arrays.asList(nums));
		 * 
		 * 
		 * int[] split1=Arrays.copyOf(nums, k+1); int[] split2=Arrays.copyOfRange(nums,
		 * k+1, k+k+1); //nums = Stream.of(split2,
		 * split1).flatMap(Stream::of).toArray().;
		 * 
		 * nums=IntStream.concat(Arrays.stream(split2),
		 * Arrays.stream(split1)).toArray();
		 * 
		 * for(int i:nums) { System.out.println(i); }
		 */
		   k %= nums.length;
	       reverse(nums,0,nums.length-1);
	       reverse(nums,0,k-1);
	       reverse(nums,k,nums.length-1);
	    }
	    public static void reverse(int[] nums, int start, int end){

	        while(start < end) {
	            int tmp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = tmp;
	            start++;
	            end--;
	        }
        
  
        
    }

}
