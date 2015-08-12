package dynamic_programming;

public class LongestCommonSubSequence {

	public int lengthOfLongestCommonSubSequence(String one,String two){
	
		char [] firstString = one.toCharArray();
		char[] secondString = two.toCharArray();
		int lengthMatrix[][] = new int[firstString.length+1][secondString.length+1];
		//row is first string; col is second string
		
		for(int i = 0; i <= firstString.length; i++){
			for(int j = 0; j <= secondString.length;j++){
				if(i== 0|| j ==0){
					lengthMatrix[i][j] = 0;
				}
				
				else if(firstString[i-1] == secondString[j-1]) {
					lengthMatrix[i][j] = lengthMatrix[i-1][j-1] + 1 ;
				}
				else {
					lengthMatrix[i][j] = Math.max(lengthMatrix[i-1][j],lengthMatrix[i][j-1]) ;
				}
			}
		}
		
		return lengthMatrix[firstString.length][secondString.length];
	}
}
