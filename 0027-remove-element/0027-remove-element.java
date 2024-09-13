class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            if(nums[l]!=val)
                l++;
            else//nums[l]=val
            {
                swap(l,r,nums);
                r--;
            }
        }
     /*   int count=0;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]!=val)
                count++;
        }
        return count;*/
        return l;
    }
    public void swap(int l,int r,int[] nums)
    {
        int temp;
        temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}