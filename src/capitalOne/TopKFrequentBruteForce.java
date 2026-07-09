package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentBruteForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,1,1,2,1,2,3,3,3,3,3,2,2,2};
		int k =2;
		
		System.out.println(Arrays.toString(topKFrequent(nums, k)));
	}

	public static int[] topKFrequent(int[] nums, int k) {
		
		Map<Integer, Integer> hMap = new HashMap<>(); // checking the frequency of each number
		
		for(int num:nums) {
			hMap.put(num, hMap.getOrDefault(num, 0)+1);
		}
		
		List<Integer> uniqueNumbers = new ArrayList<>(hMap.keySet()); // putting all the unique numbers to list to be able to sort them
		
		uniqueNumbers.sort((a,b)-> hMap.get(b) - hMap.get(a)); //Comapring by looking thier frequencies in the map and puting the higher frequency first
		
		int[] result= new int[k];
		for(int i=0;i<k;i++) {
			result[i] = uniqueNumbers.get(i);
		}
		return result;
	}
}
