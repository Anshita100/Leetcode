class Solution {
    public int[] findErrorNums(int[] nums) {
      /*int n=nums.length;
        int as=n*(n+1)/2,cs=0;
        HashSet<Integer> set=new HashSet<>();
        int dupli=-1;
        for(int each_num:nums)
        {
            cs=cs+each_num;
            if(set.add(each_num)==false)
            {
                dupli=each_num;
            }
        }
        cs=cs-dupli;
        int missing=as-cs;
        int res[]=new int[2];
        res[0]=dupli;
        res[1]=missing;
        return res;*/
        
        int dupli=-1; int missing=-1;
        for(int i=0;i<nums.length;i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0)
            {
                nums[index]=-nums[index];
            }        
            else//negative
            {
                dupli=Math.abs(nums[i]);
            }    
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                missing=i+1;
        }
        return new int[]{dupli,missing};
    }
}