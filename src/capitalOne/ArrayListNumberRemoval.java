package capitalOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListNumberRemoval {

	public static void main(String[] args) {

		List<Integer> numbers=new ArrayList<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		numbers.add(30);
		
		Set<Integer> set= new LinkedHashSet<>(numbers);
		List<Integer> result=new ArrayList<>(set);
		System.out.println(result);
		// Or better Approach
		
		Set<Integer> seen=new HashSet<>();
		numbers.removeIf(number -> !seen.add(number));
		
		System.out.println(numbers);
		
	}

}
