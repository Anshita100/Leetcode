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
      /*  int l=0,r=0;int count=0;int maxlen=0;
        while(r<nums.length)//O(n)
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
                   while(l<=r && nums[l]==1) l++;//O(n)
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
        return maxlen;//TC-O(2n)*/
        
        int l=0,r=0,maxlen=0,count=0;
        for(r=0;r<nums.length;r++)
        {
            if(nums[r]==0) count++; 
            
            if(count>k)
            {
                if(nums[l]==0) 
                    count--; 
                
                l++;  
            }
            if(count<=k)
            {
                maxlen=Math.max(maxlen,r-l+1); 
            }
        }
        return maxlen;
    }
}