package heuristic;

public class LongestCommonSubSequence {

	public int lengthOfLongestCommonSubSequence(String string1, String string2,int m , int n) {
        if(m == 0 || n== 0) return 0;   
		if(string1.charAt(m-1) == string2.charAt(n-1)) {
			return 1 + lengthOfLongestCommonSubSequence(string1, string2, m-1, n-1);
		}
		else {
			return Math.max(lengthOfLongestCommonSubSequence(string1, string2, m-1, n),lengthOfLongestCommonSubSequence(string1, string2, m, n-1));
		}
		
		
	}

}
