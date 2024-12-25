class Solution {
    //brute approach TC-O(n*n)
  /*  public int numSubarraysWithSum(int[] a, int goal) {
        int ans=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                   sum=sum+a[j];
                    if(sum==goal)
                        ans++;
                
            }
        }
        return ans;        
    }*/
    
    public int numSubarraysWithSum(int[] a, int goal) {
        return count(a,goal)-count(a,goal-1);
    }
    public static int count(int[]a ,int goal)//count subarray which have sum less than or equal to goal
    {
        if(goal<0) return 0;
        int l=0,r=0,ans=0,sum=0;
        for(r=0;r<a.length;r++)
        {
            sum=sum+a[r];
           
            while(sum>goal)//shink
            { 
              sum=sum-a[l]; l++;  
            }
            ans=ans+(r-l+1);
        }
        return ans;
    }
}