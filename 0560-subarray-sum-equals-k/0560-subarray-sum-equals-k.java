class Solution {
    //brute force approach-har ek subarray ka sum calculate karo aur check karo ki k ke value hai kya?
   /*public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
           int sum=0;
           for(int j=i;j<n;j++)
           {
               sum=sum+nums[j];
               if(sum==k)
                   count++;
           }
        }
        return count;
    }*/
    /*public int subarraySum(int[] nums, int k) {
        return ans(nums,k)-ans(nums,k-1);
    } 
    public int ans(int[] nums, int k)
    {
        if(k<=0) return 0;
        //count subarray whose sum is less than or equal to k
        int l=0;int sum=0;int count=0;
        for(int r=0;r<nums.length;r++)
        {
             sum=sum+nums[r];
             while(sum>k)
             {
                 sum=sum-nums[l]; l++;
             }
            
                count=count+(r-l+1);
             
        }
        return count;
    }  */
    public int subarraySum(int[] nums, int k) {
     HashMap<Integer, Integer> subNum = new HashMap<>();
        subNum.put(0, 1);
        int total = 0, count = 0;

        for (int n : nums) {
            total += n;

            if (subNum.containsKey(total - k)) {
                count += subNum.get(total - k);
            }

            subNum.put(total, subNum.getOrDefault(total, 0) + 1);
        }

        return count;        
    } 
    
}