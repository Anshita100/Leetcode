class Solution {
    public boolean isHappy(int n) {
        if(n<=0)
            return false;
        
       HashSet<Integer>hs=new HashSet<>();
       while(n!=1)
       {
           if(hs.contains(n))
           {
               return false;
           }
           hs.add(n);
           n=helper(n);
       }
       return true;
    }
    public static int helper(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int a=n%10;
            sum=sum+(a*a);
            n=n/10;
        }
        return sum;
    }
}