package capitalOne;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {

		String sentence= "Dilip Nikki Dilip Advika Nikki Rudransh Advika Rudransh";
		
		String[] words=sentence.split(" ");
		
		Map<String, Integer> map=new HashMap<>();
		
		for(String word :words) {
			map.put(word, map.getOrDefault(word, 0) +1);
		}
		
		for(Map.Entry<String,Integer> entry: map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey()+" = "+ entry.getValue());
			}
		}
	}

}
