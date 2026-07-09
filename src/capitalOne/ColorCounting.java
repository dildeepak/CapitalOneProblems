package capitalOne;

import java.util.ArrayList;
import java.util.HashMap;

public class ColorCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors=new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		colors.add("blue");
		
		HashMap<String, Integer> colorsMap=new HashMap<>();
		
		for(String color:colors) {
			if(colorsMap.containsKey(color)) {
				colorsMap.put(color, colorsMap.get(color) +1);
			}else {
				colorsMap.put(color, 1);
			}
		}
		
		for(String key:colorsMap.keySet()) {
			System.out.println(key + ":" + colorsMap.get(key));
		}
		
		
		

	}

}
