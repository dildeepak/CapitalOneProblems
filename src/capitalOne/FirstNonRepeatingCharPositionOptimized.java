package capitalOne;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharPositionOptimized {
	public static int firstUniqChar(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Pass 1: Count how many times each character appears
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        // Pass 2: Look through the string sequentially to find the first count of 1
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println("First unique character index: " + firstUniqChar(s)); 
        // Output: 2 (The character 'v' is unique and at index 2)
    }
}
