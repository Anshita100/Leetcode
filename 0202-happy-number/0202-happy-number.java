class Solution {
    public boolean isHappy(int n) {
        if(n<=0)
            return false;
        
      Set<Integer> seen = new HashSet<>();
        
        while (n != 1) {
            if (seen.contains(n)) {
                return false;  // A cycle detected, not a happy number
            }
            seen.add(n);
            n = helper(n);  // Calculate the sum of squares of the digits
        }
        
        return true;  // Reached 1, so it's a happy number
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