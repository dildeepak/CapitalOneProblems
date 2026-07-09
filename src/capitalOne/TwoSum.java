package capitalOne;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums= {2,7,11,15};
		int target = 17;
		
		Map<Integer, Integer> map=new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int required = target - nums[i];
			
			if(map.containsKey(required)) {
				System.out.println(required+","+nums[i]); // for displaying the value
				 System.out.println(map.get(required) + ", " + i); // for displaying the index
				return;
			}
			
			map.put(nums[i], i);
		}
	}

}
