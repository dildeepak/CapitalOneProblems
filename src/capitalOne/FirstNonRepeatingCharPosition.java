package capitalOne;

public class FirstNonRepeatingCharPosition {
	 public static int firstUniqChar(String s) {
	        // Fast tracking array for lowercase English letters (a-z)
	        int[] charCounts = new int[26];
	        
	        // Pass 1: Build the frequency distribution
	        for (int i = 0; i < s.length(); i++) {
	            charCounts[s.charAt(i) - 'a']++;
	        }
	        
	        // Pass 2: Find the first character with a frequency count of 1
	        for (int i = 0; i < s.length(); i++) {
	            if (charCounts[s.charAt(i) - 'a'] == 1) {
	                return i; // Return index of first non-repeating character
	            }
	        }
	        
	        return -1; // No unique character found
	    }

	    public static void main(String[] args) {
	        String s = "leetcode";
	        System.out.println("First unique character index: " + firstUniqChar(s)); 
	        // Output: 0 (The character 'l' is unique and at index 0)
	    }
}
