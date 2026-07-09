package capitalOne;

import java.util.Arrays;
import java.util.List;

public class ArrayListSecondHighest {

	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(10,40,20,50,30);
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for(int num:numbers) {
			if(num > highest) {
				secondHighest = highest;
				highest=num;
			}else if(num > secondHighest && num != highest) {
				secondHighest = num;
			}
		}
		System.out.println(secondHighest);
		

	}

}
