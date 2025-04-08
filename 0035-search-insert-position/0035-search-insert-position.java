class Solution {
    //0ms
    public int searchInsert(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=(s+e)/2;

            if(nums[mid]==target)
            return mid;

            else if(nums[mid]<target)
            {
                ans=mid;
                s=mid+1;
            }
            else
            e=mid-1;
        }
        return ans+1;
       /* int a=-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target)
            {
                a=mid;
                e=mid-1;
            }
            else
            {
                a=mid+1;
                s=mid+1;
            }
        }
        return a;*/
    }
}
/* 0ms
class Solution {
    public int searchInsert(int[] a, int target) {
        int n=a.length;
        int s=0; int e=n-1;
        while(s<=e)
        {
            int mid=(s+e)/2;

            if(a[mid]==target) return mid;
            else if(a[mid]<target) s=mid+1;
            else 
            e=mid-1;

        }
        return s;
    }
} */