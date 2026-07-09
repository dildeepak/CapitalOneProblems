package leetcode.easy;

public class ValidParanthesis {

	public static void main(String[] args) {
		String str= "()[]{}";
		
		System.out.println(isValid(str));
		
	}
	private static boolean isValid(String s) {
		while(true) {
			if(s.contains("()"))
				s=s.replace("()", "");
			else if (s.contains("{}"))
				s=s.replace("{}", "");
			else if (s.contains("[]"))
				s=s.replace("[]", "");
			else
				return s.isEmpty();
				
		}
	}

}
