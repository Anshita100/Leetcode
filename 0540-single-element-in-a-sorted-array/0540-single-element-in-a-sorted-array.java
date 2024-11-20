class Solution {
    public int singleNonDuplicate(int[] nums) {
        
       int i=0;
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        while(i<=n-2)
        {
            if(nums[i]==nums[i+1])
                i=i+2;
            else
                return nums[i];
        }
        return nums[n-1];
    }
}