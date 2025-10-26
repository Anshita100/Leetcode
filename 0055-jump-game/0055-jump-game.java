/*
Intuition
The goal is to determine if we can reach the last index from the first index.
Since each number represents how far we can jump, we need a way to track the farthest point reachable as we go.

Approach
We use a greedy strategy and keep a variable maxReach to store the farthest index we can reach at any point.
As we iterate through the array:

If the current index i is greater than maxReach, it means we are stuck and can't proceed.
Otherwise, we update maxReach to the maximum of its current value and i + nums[i].
If we can iterate through the entire array without getting stuck, we can reach the last index.

 */
class Solution {
    //striver
   /* public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reachable) return false;  // if you're stuck
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }*/
    //TLE 78 / 175 testcases passed
    /*public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean ans=solve(nums,0,n);
        return ans;
    }
    public boolean solve(int[] nums,int idx,int n)
    {
        if(idx==n-1) return true;
        if(idx>=n)return false;
        for(int i=1;i<=nums[idx];i++)
        {
            if(solve(nums,idx+i,n))
            return true;
        }
        return false;
    }*/
    //Why this works:
/*Boolean[] can hold 3 values: true, false, or null.
null means “not yet computed”.
Once computed, you store true or false to avoid recomputation.*/
 // boolean dp[]=new boolean[n];
//But your dp array is of primitive type boolean[], and primitive booleans cannot be compared with null, since they only store true or false.
    public boolean canJump(int[] nums) {
        int n = nums.length;
        Boolean dp[] = new Boolean[n]; // use Boolean, not boolean
        boolean ans = solve(nums, 0, n, dp);
        return ans;
    }

    public boolean solve(int[] nums, int idx, int n, Boolean[] dp) {
        if (idx >= n - 1) // ✅ fixed here
            return true;

        if (dp[idx] != null)
            return dp[idx];

        for (int i = 1; i <= nums[idx]; i++) {
            if (solve(nums, idx + i, n, dp))
                return dp[idx] = true;
        }

        return dp[idx] = false;
    }
}