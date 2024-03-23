class Solution {
    public boolean check(int[] nums) {
        int pair=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
                pair++;
        }
        if(nums[nums.length-1]>nums[0])
            pair++;
        
        return pair<=1;
        
    }
}