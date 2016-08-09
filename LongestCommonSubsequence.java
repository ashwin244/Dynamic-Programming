package dynamicProgramming;

/**
 * 
LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4. 
 *
 */
public class LongestCommonSubsequence {

	public int lcs(String x, String y) {
		int[][] lcs = new int[x.length() + 1][y.length() + 1];
		
		for(int i = 0; i <= x.length(); i++) {
			for(int j = 0; j <= y.length(); j++) {
				 if(i==0 || j==0) {
					 lcs[i][j] = 0;
				 }
				 else if(x.charAt(i - 1) == y.charAt(j - 1)) {
					 lcs[i][j] = 1 + lcs[i-1][j-1];
				 }
				  
				 else {
					 lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
				 }
			}
		}
		
		return lcs[x.length()][y.length()];	
	}
}
