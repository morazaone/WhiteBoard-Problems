class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] s = text1.toCharArray();
        char[] t = text2.toCharArray();
        int[][] dp = new int[s.length+1][t.length+1];
        
        for(int i = 0; i <= s.length; i++) {
            dp[i][0] = 0;
        }
        for(int i = 0; i <= t.length; i++) {
            dp[0][i] = 0;
        }
        
        for(int i = 1; i <= s.length; i++) {
            for(int j = 1; j <= t.length; j++) {
                if(s[i-1] == t[j-1]) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[s.length][t.length];
    }
}
