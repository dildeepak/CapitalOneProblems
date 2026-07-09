package capitalOne;

import java.util.LinkedList;
import java.util.Queue;

public class PaymentQueueDemo {

	public static void main(String[] args) {

		Queue<String> paymentEvents= new LinkedList<>();
		
		paymentEvents.offer("PAYMENT_INITIATED");
		paymentEvents.offer("FRAUD_CHECK_COMPLETED");
		paymentEvents.offer("PAYMENT_SETTLED");
		
		while(!paymentEvents.isEmpty()) {
			String event = paymentEvents.poll();
			System.out.println("Processing event: "+ event);
		}
	}

}
