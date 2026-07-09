package leetcode.medium;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="pwwkew";
		
		System.out.println(lengthOfLongestSubstring(s));

	}
	public static int lengthOfLongestSubstring(String s) {
		if(s.isEmpty() || s.length()==0)
		{
			return 0;
		}
		if(s.length()==1) {
			return 1;
		}

        int count =0;
        //StringBuilder sb= new StringBuilder(s);
        String str= new String();
        
        for(int i=0;i<s.length();i++){
            if(str.contains(Character.toString(s.charAt(i)))){
                //i++;
                count=0;
            }else{
                str=str.concat(Character.toString(s.charAt(i)));
                count++;
            }
        }

      return str.length();  
    }

}
