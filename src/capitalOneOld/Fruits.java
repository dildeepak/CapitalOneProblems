package capitalOneOld;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// list of fruits 
//List<String> items = Arrays.asList("apple", "banana", "orange", "apple");
//make them in upper case
//find number of fruits = 4
// num of apples = 2

public class Fruits {

	public static void main(String[] args) {

		List<String> items = Arrays.asList("apple", "banana", "orange", "apple");
		System.out.println(items.stream().map(n -> n.toUpperCase())
				.collect(Collectors.toList()));

	}

}
