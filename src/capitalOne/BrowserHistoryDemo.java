package capitalOne;

import java.util.Deque;
import java.util.LinkedList;

public class BrowserHistoryDemo {

	public static void main(String[] args) {

		Deque<String> history = new LinkedList<>();
		
		history.offer("home");
		history.offer("products");
		history.push("checkout");
		
		System.out.println("Current Page " + history.peek());
		
		System.out.println("Back from " + history.pop());
		
		System.out.println("Now at " + history.peek());
	}

}
