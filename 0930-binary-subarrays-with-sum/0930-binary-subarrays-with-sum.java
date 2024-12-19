class Solution {
    public int numSubarraysWithSum(int[] a, int goal) {
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
    }
}