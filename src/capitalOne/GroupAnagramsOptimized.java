package capitalOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsOptimized {

	public static void main(String[] args) {
		String[]  strs = {"eat","tea","ate","ban","fan", "naf"};
		System.out.println(groupAnagrams(strs));
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null ||  strs.length == 0){
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramMap= new HashMap<>();

        for(String word:strs){

            char[] count= new char[26]; //fixed size primitive array

            for(int i=0;i<word.length();i++){
                count[word.charAt(i) -'a']++;
            }
            
            String frquencyKey= new String(count);
            anagramMap.computeIfAbsent(frquencyKey, k-> new ArrayList<>()).add(word); //retrive the matching group loist and add the word
        }
        return new ArrayList<>(anagramMap.values());
    }

}
