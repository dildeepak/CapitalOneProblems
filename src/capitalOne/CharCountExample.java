package capitalOne;

import java.util.HashMap;
import java.util.Map;

public class CharCountExample {
	
	    // Function to count the frequency of each letter in a given sentence
	    public static HashMap<Character, Integer> countLetterFrequency(String sentence) {
	        HashMap<Character, Integer> letterCount = new HashMap<>();
	        sentence=sentence.toLowerCase();
	        for (char letter : sentence.toCharArray()) {
	            //If the character is a letter, update its count in the HashMap
	            // or add it with a count of 1 if it's not already there
	            //letter.
	            if(Character.isLetter(letter))
	            letterCount.put(letter, letterCount.getOrDefault(letter ,0) + 1);
	        }
	        return letterCount;
	    }

	    public static void main(String[] args) {
	        String sentence = "Once upon a time in a faraway library";
	        // Call the function with the sentence variable and print the result
	        HashMap<Character, Integer> hMap = countLetterFrequency(sentence);
	         
	        //Approach 1: Better one
	        for(Map.Entry<Character,Integer> entry : hMap.entrySet()){
	           //System.out.println(entry.getKey()+ " : " + entry.getValue());            
	        }
	        //Approach 2: Good One
	        for(Character key:hMap.keySet()) {
				//System.out.println(key + ":" + hMap.get(key));
			}
	        //Approach 3: Best one
	        hMap.forEach((key, value) -> System.out.println(key + ":" + value));
	    }
	}
