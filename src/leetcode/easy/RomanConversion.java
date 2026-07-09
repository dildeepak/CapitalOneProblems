package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanConversion {

	public static void main(String[] args) {
		String s= "XIV";
		Map<Character,Integer> hMap=new HashMap<>();

        hMap.put('I', 1);
        hMap.put('V', 5);
        hMap.put('X', 10);
        hMap.put('L', 50);
        hMap.put('C', 100);
        hMap.put('D', 500);
        hMap.put('M', 1000);

        int result = 0;

        for(int i=0;i<s.length();i++){
            if(i<s.length() -1 && hMap.get(s.charAt(i))<hMap.get(s.charAt(i+1))){
                result = result - hMap.get(s.charAt(i));
            }else{
                result = result + hMap.get(s.charAt(i));
            }
        }
        
        System.out.println("Integer value is " + result);

	}

}
