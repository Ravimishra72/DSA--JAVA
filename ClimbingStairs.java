class Solution {
    public int totalWay(int n,int[] dp){
        if(n == 1 || n== 0){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = totalWay(n-1,dp) + totalWay(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        }
        return totalWay(n,dp);
    }
}