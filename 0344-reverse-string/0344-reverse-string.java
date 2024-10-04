class Solution {
     public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
         while(l<r)
         {
             s[l]=(char) (s[l]^s[r]);
             s[r]=(char) (s[l]^s[r]);
             s[l]=(char) (s[l]^s[r]);
             l++;r--;
         }
     }
 /*   public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while(start<end)
        {
               char temp;
               temp=s[start];
               s[start]=s[end];
               s[end]=temp;
               start++;
               end--;
              
        }
    }*/
}