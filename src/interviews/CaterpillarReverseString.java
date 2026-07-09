package interviews;

public class CaterpillarReverseString {
	/**
	 * Reverse String except special character. 
You can use Character.isLetter() to determine is if regular letter or special character
Input: A#BCd%$&eFGH@@
Output: H#GFe%$&dCBA@@
	 * @param args
	 */

	public static void main(String[] args) {
		String input="A#BCd%$&eFGH@@";//8 alphabets
		/*if(input == null || input.isEmpty()) {
			return input;
		}*/
		
		int left=0;
		int right=input.length()-1;		
		char[] ch=input.toCharArray();
		
		while(left < right) {	
			
			if(!Character.isLetter(ch[left])) {
				left++;
			}else if(!Character.isLetter(ch[right])) {
				right--;
			}else {
				char temp=ch[left];
				ch[left] = ch[right];
				ch[right]=temp;
				left++;
				right--;
			}
		}
		System.out.println("Reversed string is " + new String(ch));

	}

}
