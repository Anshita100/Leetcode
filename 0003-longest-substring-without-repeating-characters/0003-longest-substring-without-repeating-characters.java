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
              Set<Character>hs=new HashSet<>();
              for(int j=i;j<n;j++)
              {
                  if(hs.contains(s.charAt(j)))
                  {
                      ans=Math.max(ans,(j-1)-i+1);
                      break;
                  }
                   hs.add(s.charAt(j));
              }
        }
        return ans;
    }*/
    
    //optimised approach
    public int lengthOfLongestSubstring(String s) {
        int l=0;int ans=0;
        Set<Character>hs=new HashSet<>();
        for(int r=0;r<s.length();r++)
        {
           
                while (hs.contains(s.charAt(r))) {
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(s.charAt(r));
                ans=Math.max(ans,r-l+1);
        }
        return ans;     
    }
    
/*     public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0;
        int maxlen = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        while (r < n) {
            char currentChar = s.charAt(r);
            if (hm.containsKey(currentChar)) {
                l = Math.max(hm.get(currentChar) + 1, l);  // Ensure 'l' only moves forward
            }
            hm.put(currentChar, r);
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }

        return maxlen;
    }*/
}