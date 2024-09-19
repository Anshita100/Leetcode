class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int maxfreq=0;int countofmax=0;
        for(int i:nums)
        {
            int freq=hm.getOrDefault(i,0)+1;
            hm.put(i,freq);
            
            if(freq>maxfreq)
            {
                maxfreq=freq;
                countofmax=1;
            }
            else if(freq==maxfreq)
            {
                countofmax++;
            }
            
        }
        
        
        return (countofmax*maxfreq);
    }
}