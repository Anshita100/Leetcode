class Solution {
    public int longestOnes(int[] nums, int k) {
      //longest subarray with atmost k zeroes
       //brute force 
       /* int n=nums.length;int maxlen=0;
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
        return maxlen;*/
        //sliding window
        int l=0,r=0;int count=0;int maxlen=0;
        while(r<nums.length)
        {
           if(nums[r]==1)
           {
               
               maxlen=Math.max(maxlen,r-l+1);
               r++;
           }
           else //nums[r]==0
           {
               count++;
               if(count>k)
               {
                   while(l<=r && nums[l]==1) l++;
                   
                   //nums[l]=0
                   l++; count--;
                   maxlen=Math.max(maxlen,r-l+1);
                   r++;
               }
               else
               {
                   maxlen=Math.max(maxlen,r-l+1);
                   r++;
               }    
           }    
                
        }
        return maxlen;
    }
}