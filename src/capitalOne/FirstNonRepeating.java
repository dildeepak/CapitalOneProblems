package capitalOne;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {

	public static void main(String[] args) {

		String input="programming";
		
		Map<Character, Integer> map=new HashMap<>();
		
		for(char ch:input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
	    map.entrySet().stream()
	    .filter(entry -> entry.getValue() == 1)
	    .map(Map.Entry::getKey)
	    .findFirst()
	    .ifPresent(System.out::println);
	    
	    // OR
	    
	    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
	}

}
