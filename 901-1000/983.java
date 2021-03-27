class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        int[] dp = new int[lastDay + 1];

        int index = 0;
        for (int i = 1; i <= lastDay; i++) {
            if (i == days[index]) {
                dp[i] = Math.min((i >= 1 ? dp[i - 1] : 0) + costs[0], 
                        Math.min((i >= 7 ? dp[i - 7] : 0) + costs[1], 
                                (i >= 30 ? dp[i - 30] : 0) + costs[2]));
                index++;
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[lastDay];
    }
}
