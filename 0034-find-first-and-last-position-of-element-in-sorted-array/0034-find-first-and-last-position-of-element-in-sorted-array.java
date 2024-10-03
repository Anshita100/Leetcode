class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;int e=nums.length-1;
        while(s<=e)
        {
            int mid=(s+e)/2;
            
            if(nums[mid]==target)
            {    
                // Find left bound
                int l = mid;
                while (l > 0 && nums[l - 1] == target) {
                    l--;
                }

                // Find right bound
                int r = mid;
                while (r < nums.length - 1 && nums[r + 1] == target) {
                    r++;
                }

                return new int[]{l, r};
            }    
            else if(nums[mid]<target)
                s=mid+1;
            else
                e=mid-1;
        }
        return new int[]{-1,-1};
    }
}