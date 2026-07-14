package capitalOne;

public class LongestPalindromicSubstringSimple {

	public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) 
            return "";
        String maxPalindrome = "";
        int maxLen = 0;
        int n = s.length();

        // Generate all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int currentLen = j - i + 1;
                
                // Only check if this substring is longer than our current max
                if (currentLen > maxLen) {
                    if (isPalindrome(s, i, j)) {
                        maxLen = currentLen;
                        maxPalindrome = s.substring(i, j + 1);
                    }
                }
            }
        }
        return maxPalindrome;
    }

    // Helper method to check if a substring is a palindrome using two pointers
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String testInput = "babad";
        
        System.out.println("Input String: " + testInput);
        System.out.println("--- Testing Brute Force with O(N3)---");
        System.out.println("Result: " + longestPalindrome(testInput)); // Output: "bab" or "aba"
        
        
    }

}
