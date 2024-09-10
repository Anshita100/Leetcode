class Solution {
    public int findDuplicate(int[] nums) {
      /*  HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                return nums[i];
            }
            hm.put(nums[i],i);
        }
        return -1;*/
        
        HashSet<Integer>hs=new HashSet<>();
        for(int ele:nums)
        {
            if(hs.add(ele))
            {
                //do nothing
            }
            else//hs.add(ele) returns false means element already present
            {
                return ele;
            }
        }
        return -1;
    }
}