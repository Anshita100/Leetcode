class Solution {
   // public int numberOfSubarrays(int[] nums, int k) {
       //brute approach TLE
       /* int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]%2!=0)//odd
                    count++;
                
                if(count==k)
                    ans++;
                if(count>k)
                break;
            }
        }
        return ans;
    } */
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }     
    public static int count(int []nums,int k)
    {
        if(k<0)return 0;
        int l=0,r=0,ans=0,sum=0;
        for(r=0;r<nums.length;r++)
        {
            if(nums[r]%2!=0)//odd
            {
                sum=sum+1;
            }
            while(sum>k)
            {
                if(nums[l]%2!=0)
                sum=sum-1;
                
                l++;
            }
            ans=ans+(r-l+1);
        }
        
        return ans;
    }
}