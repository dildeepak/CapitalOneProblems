package walmart;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array of integers [10,50,30,40,80] => 50
		// find 2nd highest element in the array
		
		List<Integer> ls=Arrays.asList(10,50,30,40,80);
		// normal for loop
		Collections.sort(ls); //10,30,40,50,80
		//for(int i=0;i<ls.size();)
		ls.stream().map(i -> i.SIZE-1).forEach(null);
		

	}

}
