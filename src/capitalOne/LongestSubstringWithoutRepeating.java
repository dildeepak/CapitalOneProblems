package capitalOne;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {

		String input= "aaabbccabcc";
		int maxLength=0;
		int left = 0;
		Map<Character, Integer> charMap= new HashMap<>();
		
		for(int right=0;right<input.length();right++) {
			char currentChar = input.charAt(right);
			
			if(charMap.containsKey(currentChar)) {
				left=Math.max(left, charMap.get(currentChar)+1);
			}
			
			
			
			charMap.put(currentChar, right);
			
			maxLength=Math.max(maxLength, right-left+1);
		}
		System.out.println(" The longest string size is " + maxLength);		
	}
}
