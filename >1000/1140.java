class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n+1];
        int preSum = 0;
        for(int i = n-1; i>=0;i--){
            preSum+=piles[i];
            for(int M = n;M>=1;M--){
                if(2*M>=n-i){
                    dp[i][M] = preSum;
                }else{
                    for(int x=1;x<=2*M;x++){
                        dp[i][M] = Math.max(dp[i][M],preSum-dp[i+x][Math.max(x,M)]);
                    }
                }
            }
        }
        return dp[0][1];
    }
}
