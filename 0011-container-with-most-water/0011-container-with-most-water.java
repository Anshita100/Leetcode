class Solution {
    public int maxArea(int[] height) {
       int n=height.length;
       int l=0;
       int r=n-1;
       int ans=0,res=0;
       while(l<=r) 
       {
           ans=Math.min(height[l],height[r]);
           res=Math.max(ans*(r-l),res);
           if(height[l]<height[r])
           {
               l++;
           }
           else
           {
               r--;
           }
       }
       return res;
    }
}