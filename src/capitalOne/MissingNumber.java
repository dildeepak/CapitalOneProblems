package capitalOne;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5,6,7,8,10};
		
		Set<Integer> set= new HashSet<>();
		
		for(int num:numbers) {
			set.add(num);
		}
		
		for(int i=1; i<10; i++) {
			if(!set.contains(i)) {
				System.out.println("Missing number is " + i);
				break;
			}
		}
	}

}
