package capitalOne;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindowVariableDemo {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println("max length of the substring is " + lengthOfLongestSubstring(s));
	}

	private static int lengthOfLongestSubstring(String s) {

		Set<Character> set= new HashSet<>();
		
		int left=0;
		int maxLength =0 ;
		
		for(int i=0;i<s.length();i++) {
			char currentChar = s.charAt(i);
			
			//check for duplicate , if found remove it from left
			while(set.contains(currentChar)) {
				set.remove(s.charAt(left));
				left++;
			}
			//add the current character
			set.add(currentChar);
			//update the answer
			maxLength = Math.max(maxLength, i-left+1);
			}
		
		
		
		
		return maxLength;
	}

}
