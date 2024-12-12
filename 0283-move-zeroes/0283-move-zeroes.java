class Solution {
    public void moveZeroes(int[] nums) {
     //used snowballconcept
        int snowballcount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                snowballcount++;
            else if(snowballcount > 0)//if i have snowballs then shift nonzero before snowball
            {
               
                nums[i-snowballcount]=nums[i];
                nums[i]=0;
            }
        }
        
    }
}