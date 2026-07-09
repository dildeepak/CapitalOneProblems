package capitalOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentWordsSimple {

	public static void main(String[] args) {
		
		String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
		int k = 4;
		System.out.println((topKFrequent(words,k)));
	}
	public static List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> frequencyMap = new HashMap<>(); // to find the frequency of the word using getordefault
        for(String word:words){
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        List<String> uniqueWords = new ArrayList<>(frequencyMap.keySet()); // to put the unique words into a list for lter sorting them

        //Sort the list with rules
        uniqueWords.sort((word1, word2) -> {
          int freq1= frequencyMap.get(word1);
          int freq2= frequencyMap.get(word2);

            //Rule 1: If frequencies are different, sort by highest frequency first
          if(freq1 != freq2){
            return freq2 - freq1;
          }
            // Rule 2 : If frequencies match, sort alphabetically (lexicographically)
           return word1.compareTo(word2);
        });

        return uniqueWords.subList(0, k);
    }

}
