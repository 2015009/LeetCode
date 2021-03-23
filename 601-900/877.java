class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        for(int i=0; i<n;i++){
            dp[i][i]=piles[i];
        }
        for(int i = n-1; i>=0; i--){
            for(int j = i+1; j<n; j++)
                dp[i][j] = Math.max(piles[j]-dp[i][j-1],piles[i]-dp[i+1][j]);
        }
        
        return dp[0][n-1]>0;
    }
}
