package leetcode.easy;

public class Question392 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isSubsequence("aaaaaa", "bbaaaa"));
	}

	public static boolean isSubsequence(String s, String t) {
		if (t.isEmpty() && s.isEmpty()) {
			return true;
		}
		StringBuilder sb = new StringBuilder();
		// boolean flag = false;
		for (int i = 0; i < s.length(); i++) { // 0,1,2,4
			for (int j = 0; j <= t.length(); j++) { // 0-1-2,3,4,5
				if (s.charAt(i) == t.charAt(j)) {
					sb.append(t.charAt(j));
					i++;
				}
				if(j == t.length())
						break;
			}
			
		}
		System.out.println(sb);
		System.out.println(s);
		return s.equals(sb.toString()) ? true : false;

	}

}
