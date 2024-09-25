class Solution {
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
   /* public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }*/
    public int majorityElement(int[] nums) {
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
    }
}