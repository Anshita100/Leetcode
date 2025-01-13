class Solution {
    public void moveZeroes(int[] nums) {
        //brute - 2ms
       /* int temp[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)//O(n)
        {
            if(nums[i]!=0)temp[j++]=nums[i];
        }
        for(int k=j;k<nums.length;k++)//O(x)
        {
            temp[k]=0;
        }
        for(int l=0;l<nums.length;l++)//O(n)
        {
            nums[l]=temp[l];
        }*/
        //remove duplicates wali approach
        int j=0;int i=-1;
        while(j<nums.length)
        {
            if(nums[j]==0)
            j++;
            else 
            {
                i++;
                //swap
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
     //used snowballconcept
       /* int snowballcount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                snowballcount++;
            else if(snowballcount > 0)//if i have snowballs then shift nonzero before snowball
            {
               
                nums[i-snowballcount]=nums[i];
                nums[i]=0;
            }
        }*/

        
    }
}
/*
import java.util.*;

public class tUf {
    public static int[] moveZeros(int n, int []a) {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
        if (j == -1) return a;

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}



*/