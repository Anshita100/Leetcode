class Solution {
    public void rotate(int[] a, int k) {
    //brute time limit exceed    
   /*     int n=a.length;
        for(int j=1;j<=k;j++)
        {
            int temp=a[n-1];
            for(int i=n-2;i>=0;i--)
            {
                a[i+1]=a[i];
            }
            a[0]=temp;
        }
    */
    //using the temp array
        int n=a.length;
        if (n == 0)
      return;
    k = k % n;
    if (k > n)
      return;
        
        int arr[]=new int[n];
        int j=0;
        for(int i=n-k;i<=n-1;i++)
        {
            arr[j]=a[i];
            j++;
        }
        for(int i=0;i<=n-k-1;i++)
        {
            arr[j]=a[i];
            j++;
        }
        for(int i=0;i<n;i++)
        {
            a[i]=arr[i];
        }
        
    }
}