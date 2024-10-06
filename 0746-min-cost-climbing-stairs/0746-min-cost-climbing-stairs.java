class Solution {

    int solve(int[] cost, int n){
        // if (n == 0){
        //     return cost[0];
        // }

        // if(n==1){
        //     return cost[1];
        // }

        // if(dp[n] != 0){
        //     return dp[n];
        // }    

        // dp[n] = cost[n] + Math.min(solve(cost, n-1, dp), solve(cost, n-2, dp));
        // return dp[n];
        // n = cost.length;
        int[] dp = new int[n+1];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2; i<n; i++){
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
        }

        return Math.min(dp[n-1], dp[n-2]);
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        // int[] dp = new int[n+1];
        // int ans = Math.min(solve(cost, n-1, dp), solve(cost, n-2, dp));
        return solve(cost, n);
    }
}