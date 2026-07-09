package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExamples {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Dilip");
		names.add("Nikki");
		names.add("Advika");
		names.add("Rudransh");
		
		/*
		 * List<String> filteredName=names.stream() .filter(name -> name.contains("D"))
		 * .collect(Collectors.toList());
		 * 
		 * System.out.println(filteredName);
		 */
		Collections.sort(names);
		System.out.println(names);
		
		names.removeIf("Dilip"::equals);
		//Or
		names.removeIf(name -> name.equals("Dilip"));
		System.out.println(names);

	}

}
