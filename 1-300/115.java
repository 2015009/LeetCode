class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();

        // edge case 
        if(n<m) return 0;

        //
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][m]=1;
        }

        for(int i=n-1;0<=i;i--){
            for(int j=m-1;0<=j;j--){
                if(s.charAt(i)==t.charAt(j)){
                    dp[i][j]=dp[i+1][j+1]+dp[i+1][j];
                }else{
                    dp[i][j]=dp[i+1][j];
                }

            }
        }

        return dp[0][0];
    }
}
