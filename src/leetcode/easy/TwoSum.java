package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,7,11,15};
		int target = 9;
		System.out.println(twoSum(num,target).toString());

	}
	
	private static int[] twoSum(int num[],int target) {
		Map<Integer, Integer> numMap= new HashMap<>();
		
		for(int i=0;i<num.length;i++) {
			int complement= target - num[i];
			if(numMap.containsKey(complement)) {
				return new int[] {numMap.get(complement),i};
			}
			numMap.put(num[i],i);
		}
		return new int[]{};
	}
	

}
