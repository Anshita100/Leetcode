class Solution {
    public int maxScore(int[] a, int k) {
        int lsum=0,rsum=0,maxsum=0,n=a.length;
        int i=0;
        for(i=0;i<k;i++)
        {
            lsum=lsum+a[i];
        }
        i--;
        int m=n-1;
        int total=lsum+rsum;
        for(int j=0;j<k;j++)
        {
            maxsum=Math.max(maxsum,total);
            rsum=rsum+a[m--];
            lsum=lsum-a[i--];
            total=lsum+rsum;
        }
        return Math.max(maxsum,total);
    }
}