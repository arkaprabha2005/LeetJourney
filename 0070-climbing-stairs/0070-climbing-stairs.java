class Solution {
    public int climbStairs(int n) {
        int[] stairs=new int[n+1];
        //solve(n,stairs);
        return solve(n,stairs);
    }
    public int solve(int n,int[] dp){
        if(n==1) return 1;
        if(n==2) return 2;
        if(dp[n]!=0) return dp[n];
        dp[n]=solve(n-1,dp)+solve(n-2,dp);

        return dp[n];   
    }
}