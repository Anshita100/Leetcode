class Solution {
    //brute approach O(n2)
 /*   public int majorityElement(int[] nums) {
        
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count>=((nums.length/2)+1))
              return nums[i];  
        }
        return -1;
    }*/    
    //better approach
  /*  public int majorityElement(int[] nums) {
        int n=nums.length;
        int a=(n/2)+1;
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums)
        {
            int freq=hm.getOrDefault(i,0)+1;
            hm.put(i,freq);
            if(freq>=a)
                return i;
        }
        return -1;
    }*/
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0)
            {
               count++;
               major=num[i]; 
            } 
            else if(major==num[i])
                count++;
            else 
                count--;    
        }
        return major;
    }
    //Moore Voting Algorithm
  /*  public int majorityElement(int[] nums) {
     int count = 0;
        int candidate = 0;
        
        for (int num : nums) {
            
            if (count == 0) {
                candidate = num;
            }
             if (num == candidate) {
                count++;
            } else {
                count--;
            }
           
        }
        
        return candidate;
    }*/
}