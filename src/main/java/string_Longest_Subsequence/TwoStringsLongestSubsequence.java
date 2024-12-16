package string_Longest_Subsequence;

public class TwoStringsLongestSubsequence {

	public static void main(String[] args) {
		
		String S1 = "Beautiful Sunshine";
		String S2 = "Sunshine";
		System.out.println("The Longest Subsequence : " + longCommonString(S1,S2));
		
	}
	
	public static int longCommonString(String S1 , String S2) {
		int a = S1.length();
		int b = S2.length();
		int[][] k = new int[a+1][b+1];

		for(int i=0; i<=a;i++) {
			for(int j=0; j<=b;j++) {
				if(i==0 || j==0) {
					k[i][j]=0;
				}
				
				else if(S1.charAt(i-1) == S2.charAt(j-1)) {
					k[i][j]= k[i-1][j-1]+1;
				}
				
				else { k[i][j] = Math.max(k[i-1][j],k[i][j-1]);
				
					}
				}
			
			}
				return k[a][b];
				
		}
	
}

