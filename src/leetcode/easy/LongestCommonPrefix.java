package leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] st= {"abcd", "abefg", "abd"};
		System.out.println("The longest common prefix: " + longestCommonPrefix(st));
		
	}
		
		static String longestCommonPrefix(String[] st) {
		
		StringBuilder ans = new StringBuilder();
        Arrays.sort(st);
        String first = st[0];
        String last = st[st.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
            	return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();

	}

}
