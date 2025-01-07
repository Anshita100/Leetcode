class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       //brute approach
        /*int n=nums1.length,m=nums2.length;
        int a[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
             if(nums1[i]<nums2[j])
             a[k++]=nums1[i++];
             else
             a[k++]=nums2[j++];
        }
        while(i<n)  a[k++]=nums1[i++];
        while(j<m)  a[k++]=nums2[j++];
        
        if(a.length%2==0)
           return (a[a.length / 2] + a[(a.length / 2) - 1]) / 2.0;
        else
        return a[a.length/2];*/
        
    int i = 0, j = 0;
    int k = nums1.length + nums2.length;

    // Median positions
    int idx1 = (k - 1) / 2;
    int idx2 = k / 2;

    // Variables to hold values at idx1 and idx2
    int f = -1, e = -1;

    // Counter for the merged array
    int count = -1;

    // Merge process
    while (i < nums1.length && j < nums2.length) {
        count++;
        int current;
        if (nums1[i] < nums2[j]) {
            current = nums1[i];
            i++;
        } else {
            current = nums2[j];
            j++;
        }

        // Update f and e for median positions
        if (count == idx1) f = current;
        if (count == idx2) e = current;
        
    }

    // Handle remaining elements in nums1
    while (i < nums1.length) {
        count++;
        int current = nums1[i];
        i++;

        // Update f and e for median positions
        if (count == idx1) f = current;
        if (count == idx2) e = current;
        
    }

    // Handle remaining elements in nums2
    while (j < nums2.length) {
        count++;
        int current = nums2[j];
        j++;

        // Update f and e for median positions
        if (count == idx1) f = current;
        if (count == idx2) e = current;
        
    }

    // Return median
    if (k % 2 == 0) {
        return (f + e) / 2.0; // Even case
    } else {
        return e; // Odd case
    }
}}