class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int max=0;int containedwater=0;int move;
        while(l<r)
        {
            containedwater=Math.min(height[l],height[r])*(Math.abs(l-r));
            max=Math.max(containedwater,max);
            if(height[l]<height[r])
                l++;
            else
                r--;
            
        }
        return max;
    }
}