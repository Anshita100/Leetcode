class Solution {
    public boolean isPalindrome(int x) {
       int temp=0;
       int res=x;
       int last;
       if(x<0) return false;
       while(x!=0)
       {
          last=x%10;
          temp=temp*10+last;
          x=x/10;
       }
       return temp==res;

    }
}