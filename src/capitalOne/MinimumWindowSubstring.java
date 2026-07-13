package capitalOne;

public class MinimumWindowSubstring {

	public static void main(String[] args) {

		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.out.println(minWindow(s,t));
	}
	 public static String minWindow(String s, String t) {
		 //Time Complexity: O(m + n)
		 //Space Complexity : O(1)
		    if (s == null || t == null || s.length() < t.length()) {
		            return "";
		        }
		        
		        // Count frequencies of characters in t
		        int[] map = new int[128];
		        for (char c : t.toCharArray()) {
		            map[c]++;
		        }

		        /**
		        we can shorten the for loop to like this with the help of streams
		         t.chars().forEach(c -> map[c]++);  */
		        
		        int left = 0, right = 0;
		        int minLen = Integer.MAX_VALUE;
		        int startIndex = 0;
		        int count = t.length(); // Total characters needed
		        
		        // Expand the right boundary
		        while (right < s.length()) {
		            char cRight = s.charAt(right);
		            if (map[cRight] > 0) {
		                count--;
		            }
		            map[cRight]--; // Decrement count for the window
		            right++;

		            /**
		            Similarly from line 24 till 29 can be written as 
		            if (map[s.charAt(right++)]-- > 0) count--;
		             */
		            
		            // Shrink the left boundary when the window is valid
		            while (count == 0) {
		                if (right - left < minLen) {
		                    minLen = right - left;
		                    startIndex = left;
		                }
		                
		                char cLeft = s.charAt(left);
		                map[cLeft]++;
		                // If it becomes positive, it means we missing a character from t
		                if (map[cLeft] > 0) {
		                    count++;
		                }
		                left++;
		                /** line 43 till 49 can be shriked as
		                if (map[s.charAt(left++)]++ == 0) count++; 
		                 */
		            }
		        }
		        
		        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
		    }

}
