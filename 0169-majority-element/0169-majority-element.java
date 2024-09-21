class Solution {
    public int majorityElement(int[] nums) {
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
    }
}