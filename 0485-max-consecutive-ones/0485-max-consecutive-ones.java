class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int count=0;
        int maxcount=0;
        while(i<nums.length)
        {
            if(nums[i]==1)
            {
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else
            {
                count=0;
            }
            i++;
        }
        return maxcount;
        
    }
}