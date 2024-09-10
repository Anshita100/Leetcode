class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    
    
        List<Integer> result=new ArrayList<>();
    
    /*    HashSet<Integer>hs=new HashSet<>();
        for(int ele:nums)
        {
             if(hs.add(ele)){
                //do nothing
             }
             else{
                result.add(ele);
             }
        }
        return result;
    }*/

    for(int i=0;i<nums.length;i++)
    {
        int index=Math.abs(nums[i])-1;
        if(nums[index]>0)
        {
            nums[index]=nums[index]*(-1);
        }
        else
        {
            result.add(Math.abs(nums[i]));
        }
    }
    return result;
    }
}