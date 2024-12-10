class Solution {
    //brute approach
    /*
    Time Complexity: O( N2 )
Space Complexity: O(N) where N is the size of HashSet taken for storing the elements
    */
 /*   public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
             HashSet<Character>hs=new HashSet<>();
              for(int j=i;j<n;j++)
              {
                  if(hs.contains(s.charAt(j)))
                  {
                      ans=Math.max(ans,j-i);
                      break;
                  }
                   hs.add(s.charAt(j));
              }
        }
        return ans;
    }*/
    
    public int lengthOfLongestSubstring(String s) {
        
        int l=0;int ans=0;
        HashSet<Character>hs=new HashSet<>();
        for(int r=0;r<s.length();r++)
        {
           
            if(hs.contains(s.charAt(r))==false)
            {
                hs.add(s.charAt(r));
                ans=Math.max(ans,r-l+1);
            }
            else
            {
                while(l<r && hs.contains(s.charAt(r)))
                {
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(s.charAt(r));
                ans=Math.max(ans,r-l+1);
            }
        }
        return ans;
        
    }
}