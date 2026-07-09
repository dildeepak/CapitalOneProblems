package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexPairOfString {

	public static void main(String[] args) {
		String text = "thestoryofleetcodeandme";
		String[] words = {"story","fleet","leetcode"};
		System.out.println(" words indexes are : " + indexPairs(text, words));

	}
	public static int[][] indexPairs(String text, String[] words) {
        Map<Character, List<String>> map = new HashMap<>(); 
        for(String word: words) {
            char firstChar = word.charAt(0);
            map.putIfAbsent(firstChar, new ArrayList<>());
            map.get(firstChar).add(word);
        }
                
        List<int[]> res = new ArrayList<>();
        for(int i = 0; i < text.length(); i++) {
            char firstLetter = text.charAt(i);
            if(!map.containsKey(firstLetter)) continue;
            
            List<String> temp = map.get(firstLetter);
            for(String curString: temp) {
                int len = curString.length();
                if(i + len <= text.length()) {
                    String check = text.substring(i, i + len);
                    if(check.equals(curString)) res.add(new int[]{i, i + len - 1});
                }
            }
        }
        
        int[][] ans = new int[res.size()][2];
        int idx = 0;
        for(int[] r: res) {
            ans[idx++] = r;
        }

        Arrays.sort(ans, (a,b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        return ans;
    }

}
