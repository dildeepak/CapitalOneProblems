package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentOptimized {

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
		
		 // Step 2: Create buckets where index = frequency
		List<Integer>[] buckets = new List[nums.length +1]; 
		
		for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(number);
        }

        // Step 3: Collect top k frequent elements from highest frequency bucket
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[index++] = num;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }
		return result;
	}
}
