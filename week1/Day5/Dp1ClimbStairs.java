//https://leetcode.com/problems/climbing-stairs/description/
class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;//qk agar ek hi stair rahi to 1 hi step se kaam honga
        int dp[]=new dp[n];
        dp[1]=1;
        dp[2]=2;//2nd stair 2 ways me chadh sakte [1,1] or [2]
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n]; //ankhri cell me jo value hongi wo honge no. of ways to climb stairs
    }
}

/* class Solution {
    public int climbStairs(int n) {
        // Base case: If there is only 1 stair, there is only 1 way to climb it.
        if (n == 1) return 1;

        // Create a DP array to store the number of ways to reach each step.
        int dp[] = new int[n + 1];

        // Initializing base cases:
        // There is 1 way to reach the 1st step: a single step.
        dp[1] = 1;

        // There are 2 ways to reach the 2nd step: [1+1] or [2].
        dp[2] = 2;

        // Fill the DP array for steps from 3 to n:
        // For each step i, the number of ways to reach it is the sum of the ways to reach
        // the (i-1)th step and the (i-2)th step.
        for (int i = 3; i <= n; i++) {
            // The number of ways to reach step i is:
            // - The number of ways to reach step (i-1) plus
            // - The number of ways to reach step (i-2).
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // The result is the number of ways to reach the nth step.
        return dp[n];
    }
}
*/