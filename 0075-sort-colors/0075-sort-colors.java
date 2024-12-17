class Solution {
    public void sortColors(int[] nums) {
        //brute force approach
        //Arrays.sort(nums); TC-O(n*logn)
        
        //better approach
        int a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) a++;
            else if(nums[i]==1) b++;
            else
            c++;
        }
        int j=0;
        for(j=0;j<a;j++) nums[j]=0;
        for(j=a;j<(a+b);j++) nums[j]=1;
        for(j=(a+b);j<(a+b+c);j++) nums[j]=2;
        
    }
}