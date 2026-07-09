package capitalOne;

public class ValidPalindrome {

	public static void main(String[] args) {

		String input = "M3$A123d098a@#$M";
		
		System.out.println(isPalindrome(input));
	}
	public static boolean isPalindrome(String s) {
		int left=0;
		int right=s.length()-1;
		
		while(left<right) {
			while(left<right && !Character.isLetter(s.charAt(left))){
				left++;
			}while(left<right && !Character.isLetter(s.charAt(right))) {
				right--;
			}
			if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}
				left++;
				right--;
		}
		
		return true;
	}

}
