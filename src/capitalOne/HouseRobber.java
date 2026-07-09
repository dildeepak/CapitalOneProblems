package capitalOne;

public class HouseRobber {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 9, 3, 1 };

		if (nums == null || nums.length == 0) {
			return;
		}

		int currentHouseRobbedMoney = 0; // Money upto the house we are there
		int previousHouseRobbedMoney = 0; // money till previous house

		for (int houseRobbedMoney : nums) { // let's walk through each house one by one

			// With the Math.max find the better choice comparison
			int choice = Math.max(currentHouseRobbedMoney, previousHouseRobbedMoney + houseRobbedMoney);

			// transfer the money to next one
			previousHouseRobbedMoney = currentHouseRobbedMoney;
			currentHouseRobbedMoney = choice;
		}

		System.out.println("The better chooice for house robbery is " + currentHouseRobbedMoney);

	}
}
