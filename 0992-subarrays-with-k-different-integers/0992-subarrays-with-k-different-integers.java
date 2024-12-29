class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        //TLE
     /*   int n=nums.length;int ans=0;
        for(int i=0;i<n;i++)
        {
            Set<Integer>hs=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                hs.add(nums[j]);
                if(hs.size() ==k) ans++;
                if(hs.size() >k ) break;              
            }
        }
        return ans;*/
        return count(nums,k)-count(nums,k-1);
    }
    public int count(int[] nums,int k)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        if(k<0) return 0;
        int l=0;int ans=0;int freq=0;
        for(int r=0;r<nums.length;r++)
        {
            freq=hm.getOrDefault(nums[r],0)+1;
            hm.put(nums[r],freq);

            while(hm.size()>k)
            {
                hm.put(nums[l],hm.get(nums[l])-1);
                if(hm.get(nums[l])==0)
                {
                    hm.remove(nums[l]);
                }
                l++;
            }
            ans=ans+(r-l)+1;
        }
        return ans;
    }
}