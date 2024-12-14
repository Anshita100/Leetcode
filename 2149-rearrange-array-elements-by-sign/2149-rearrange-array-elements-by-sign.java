class Solution {
    public int[] rearrangeArray(int[] nums) {
        int temp[]=new int[nums.length];
        int n=nums.length;int j=0;int k=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=0)//positive
            {
                temp[j]=nums[i];
                j=j+2;
            }
            else
            {
                temp[k]=nums[i];
                k=k+2;
            }
        }
        return temp;
    }
}