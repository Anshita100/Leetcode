class Solution {
    public int longestOnes(int[] nums, int k) {
      //longest subarray with atmost k zeroes
        int n=nums.length;int maxlen=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i;j<n;j++)
            {
               if(nums[j]==0) count++;
               if(count<=k)
               {
                   maxlen=Math.max(maxlen,j-i+1);
               }    
               else//count>k
               break;    
            }
        }
        return maxlen;
    }
}