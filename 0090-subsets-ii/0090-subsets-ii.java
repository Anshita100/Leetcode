class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums,0);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> temp,int nums[],int i)
    {
        if(i==nums.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        backtrack(result,temp,nums,i+1);
        temp.remove(temp.size()-1);
        int idx=i+1;
        while(idx<nums.length && nums[idx]==nums[idx-1])idx++;
        backtrack(result,temp,nums,idx);
    }
}