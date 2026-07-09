package leetcode.easy;


public class ReverseString {

	public static void main(String[] args) {

		char[] s = {'h','e','l','l','o'};
		
		reverseString(s);

	}
	public static void reverseString(char[] s) {
        
		 for(int i=0;i<s.length/2;i++){ // going till half of the array, as elements will be sorted once we reach there
	            char tmp=s[i];            //storing ith value to temp
	            s[i] = s[s.length -i -1]; // swapping started , saving from 0 to n in increasing order
	            s[s.length-i-1]=tmp;        // saving the temp value to nth in decreasing order 
	        }
        
       
        System.out.println(s);
       
        
        
    }
	

}
