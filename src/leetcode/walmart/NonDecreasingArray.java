package leetcode.walmart;

public class NonDecreasingArray {

	public static void main(String[] args) {
		// Came on Walmart on 06/20/2024
		/**
		 * boolean solution(int[] nums) {
//[1,1,2,7,3]=>[1,1,2,2,3] or [1,1,2,3,3]
    boolean output = false;
    int count = 0;    
    for(int i=0;i<nums.length-1;i++){
        
        if(nums[i] <= nums[i+1]){ //[2,2,1] , [3,4,1] = > false
            output = true;
        }else if(count <1){ //[2,1,1]
            count ++;
            if(i != 0 ){ //i=1
                nums[i]=nums[i+1];                
                output=true;
            }else{
                nums[i]=1; //[1,2,1]                
            }           
             
        }else{
           return false;
        }   
    }
    for(int i=0;i <nums.length-1;i++){
        if(nums[i+1]>nums[i]){
            output = false;
        }
    }
        
    return output;
}

		 */

	}

}
