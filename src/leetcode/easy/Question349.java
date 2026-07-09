package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question349 {

	public static void main(String[] args) {

		int[] num1= {4,9,5};
		int[] num2= {9,4,9,8,4};
		
		System.out.println(Arrays.toString(intersection(num1,num2)));
	}

	private static int[] intersection(int[] num1, int[] num2) {
		
		//creating a set seen from all elements in num1
		Set<Integer> seen = new HashSet<>();
		for(int num:num1) {
			seen.add(num);
		}
		
		List<Integer> result=new ArrayList<>();
		for(int num:num2) {
			if(seen.contains(num)) {
				result.add(num);
				seen.remove(num);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
