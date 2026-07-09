package capitalOne;

public class HouseRobberyWithCircle {

	public static void main(String[] args) {
			int[] nums = { 2, 7, 9, 3, 1 };

	        if(nums == null || nums.length == 0){ // NO House to rob
	            return ;
	        }

	        if(nums.length ==1){
	            return;
	        }

	        //scenario 1: start from the first house and ignore last -1 house.
	        int choice1 = robHouseStrategy(nums, 0, nums.length-2);

	        // scenario 2: start from the 2nd house and ignore the last house.
	        int choice2 = robHouseStrategy(nums, 1, nums.length-1);

	        System.out.println(" the maximum amount will be  " +  Math.max(choice1,choice2));
	    }

	    private static int robHouseStrategy(int[] nums, int startingPoint, int endPoint){

	        int currentHouseRobbedMoney = 0; // Money upto the house we are there
	        int previousHouseRobbedMoney = 0; // money till previous house    
	       
	        for(int i=startingPoint; i<=endPoint; i++){ //let's walk through each house one by one

	            int houseRobbedMoney = nums[i];
	            // With the Math.max find the better choice comparison 
	            int choice = Math.max(currentHouseRobbedMoney, previousHouseRobbedMoney + houseRobbedMoney);

	            //transfer the money to next one
	            previousHouseRobbedMoney = currentHouseRobbedMoney;
	            currentHouseRobbedMoney = choice;
	        }

	        return currentHouseRobbedMoney;
	    } 
	}

