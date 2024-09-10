class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
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
    }
}