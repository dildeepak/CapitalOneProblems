package capitalOne;

import java.util.LinkedList;

public class LinkedListReverseExample {

	public static void main(String[] args) {

		LinkedList<String> list= new LinkedList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		LinkedList<String> reversedList= new LinkedList<>();
		
		for(String item:list) {
			reversedList.addFirst(item);
		}
		
		System.out.println(reversedList);
		reversedList.removeIf("C"::equals);
		System.out.println(reversedList);
		
	}

}
