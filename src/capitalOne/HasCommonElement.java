package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HasCommonElement {

	public static void main(String[] args) {

		Integer[] arr1= {1,2,3,4,5,6}; // for approach 1, need to change the Intgere to int
		Integer[] arr2= {2,4,6,8};
		
		//Approach 1
		/**Set<Integer> set=new HashSet<>();
		List<Integer> commonNumbersList = new ArrayList<>();		
		
		for(int num:arr1) {
			set.add(num);
		}
		
		boolean hasCommon = false;
		
		for(int num:arr2) {
			if(set.contains(num)) {
				hasCommon = true;
				commonNumbersList.add(num);
				//break; // to check the first number nd then come out from the loop
			}
		}
		System.out.println(hasCommon);
		System.out.println(" Here are the common numbers from the array " + commonNumbersList);
		**/
		//Approach 2
		Set<Integer> set = new HashSet<>(Arrays.asList(arr1));
		
		set.retainAll(Arrays.asList(arr2));
		
		System.out.println(set);
		
	}

}
