package capitalOne;

import java.util.ArrayList;
import java.util.HashMap;

public class ColorCountingWithGetOrDefault {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("blue");
		
		HashMap<String, Integer> colorsMap=new HashMap<>();
		
		for(String color:colors) {
			colorsMap.put(color, colorsMap.getOrDefault(color, 0)+1);
		}
		
		for(String key:colorsMap.keySet()) {
			System.out.println(key + ":" + colorsMap.get(key));
		}
	}

}
