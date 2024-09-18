class Solution {
    public int search(int[] nums, int target) {
       int s=0,e=nums.length-1;
       while(s<=e)
       {
           int mid=(s+e)/2;
           if(nums[mid]==target)
               return mid;
           
           //ya toh left half sorted hoga ya right half aur jo bhi half sorted hai kya usme present hai
           //element if yes toh wohi search karo ya fir dusre half me search karo
           
           if(nums[s]<=nums[mid])//left half sorted
           {
               if(target>=nums[s] && target<=nums[mid])
               {
                   e=mid-1;
               }
               else//left half sorted toh hai pr target left half me nhi hai //mtlb target right half me hai
               {
                   s=mid+1;
               }    
           }
           if(nums[e]>=nums[mid])//right half sorted
           {
               if(target>=nums[mid] && target<=nums[e])
               {
                   s=mid+1;
               }
               else{
                   e=mid-1;
               }
           }
       }
       return -1; 
    }
}