class Solution {
    public int[] rearrangeArray(int[] nums) {
        int temp[]=new int[nums.length];
        int n=nums.length;int j=0;int k=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=0)//positive
            {
                temp[j]=nums[i];
                j=j+2;
            }
            else
            {
                temp[k]=nums[i];
                k=k+2;
            }
        }
        return temp;
    }
  /* its not passing all the testcases so leave this method
  public int[] rearrangeArray(int[] nums) {
        int pos=0,neg=1; int n=nums.length;
        while(pos<n && neg<n)
        {
            if(nums[pos]>=0) pos=pos+2;
            else if(nums[neg]<0) neg=neg+2;
            else//pos wala negative value ko point kar raha hai aur neg wala positve value ko toh swap kardo
            {
                int temp=nums[pos];
                nums[pos]=nums[neg];
                nums[neg]=temp;
                
                pos=pos+2;
                neg=neg+2;
            }    
        }
        return nums;
    }*/
  

}