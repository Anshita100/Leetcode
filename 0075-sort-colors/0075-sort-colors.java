class Solution {
    public void sortColors(int[] nums) {
        //brute force approach
        /*Arrays.sort(nums); //TC-O(n*logn)*/
        
        //better approach
      //   O(N) + O(N), where N = size of the array. First O(N) for counting the number of 0’s, 1’s, 2’s, and second O(N) for placing them correctly in the original array.
    /*    int a=0,b=0,c=0;
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
      */  
        //optimal solution
           int r=0,w=0,b=nums.length-1;
            while(w<=b)
            {
                if(nums[w]==0)
                {
                    //swap(nums[r],nums[w],nums);
                    int temp=nums[r]; nums[r]=nums[w];nums[w]=temp;
                    r++;
                    w++;
                }
                else if(nums[w]==1)
                {
                    w++;
                }
                else //2
                {
                    //swap(nums[w],nums[b],nums);
                    int temp=nums[w]; nums[w]=nums[b];nums[b]=temp;
                    b--;
                }    
            }
        
    }
}