class Solution {
    public int[] twoSum(int[] a, int target) {
        int res[]=new int[2];
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
           int rem=target-a[i];
           if(m.containsKey(rem))
           {
              res[0]=i;
              res[1]=m.get(rem);
           }
           m.put(a[i],i);
        }
       
        return res;
    }
}