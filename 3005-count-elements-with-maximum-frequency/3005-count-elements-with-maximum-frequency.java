class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums)
        {
            if(hm.containsKey(i))
            {
                hm.put(i,hm.get(i)+1);
            }
            else
            {
                hm.put(i,1);
            }    
        }
        int max=0;
        for(int i:hm.values())
        {
            max=Math.max(max,i);
        }
        int countofmax=0;
        for(int i:hm.values())
        {
            if(i==max)
            countofmax++;
        }
        return countofmax*max;
    }
}