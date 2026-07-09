package leetcode.easy;

public class Question1295Optimized {

	public static void main(String[] args) {

		//int[] arr = {12,345,2,6,7896};
		int[] arr= {555,901,482,1771,55};
		System.out.println("Total even numbers are " + findNumbers(arr));
	}
	 static int findNumbers(int[] nums) {
	        int count = 0;
	        for (int num : nums) {
	            int digits = String.valueOf(num).length();
	            if (digits % 2 == 0) {
	                count++;
	            }
	        }
	        return count;
	    }
	/*
	 * static int findNumbers(int[] arr) { int count =0; for(int num : arr) {
	 * if(even(num)) { count ++; } } return count; }
	 * 
	 * static boolean even(int num) { int numberOfDigits = digits(num); return
	 * numberOfDigits % 2 == 0; } static int digits(int num) {
	 * 
	 * if(num < 0) num = num * -1;
	 * 
	 * return(int)(Math.log10(num))+1; }
	 */
}
		
