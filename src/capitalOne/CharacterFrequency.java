package capitalOne;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

	public static void main(String[] args) {

		String input = "programming";
		
		Map<Character, Integer> frequency= new HashMap<>();
		
		for(char ch:input.toCharArray()) {
			frequency.put(ch, frequency.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(frequency);		
	}
}
