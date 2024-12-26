class Solution {
    public int maxScore(int[] a, int k) {
        //TC-O(2K)
     /*   int lsum=0,rsum=0,maxsum=0,n=a.length;
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
        return Math.max(maxsum,total);//ye bhar isliye likha  padha kyuki agr j<k pr total ki max value mili toh woh maxsum ke andar nhi gyi thi*/
        
        
        int total = 0;
        for (int i = 0; i < k; i++) total += a[i];
        int best = total;
        for (int i = k - 1, j = a.length - 1; i >= 0; i--, j--) {
            total += a[j] - a[i];
            best = Math.max(best, total);
        }
        return best;
    
    }
}