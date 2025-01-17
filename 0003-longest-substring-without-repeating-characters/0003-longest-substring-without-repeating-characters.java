class Solution {
    //brute approach
    /*
    Time Complexity: O( N2 )
Space Complexity: O(N) where N is the size of HashSet taken for storing the elements
    */
   public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0;
        for(int i=0;i<n;i++)
        {
              Set<Character>hs=new HashSet<>();
              for(int j=i;j<n;j++)
              {
                  if(hs.contains(s.charAt(j)))
                  {                      
                      break;
                  }
                  hs.add(s.charAt(j));
                  maxlen=Math.max(maxlen,j-i+1);
              }
        }
        return maxlen;
    
    
    //optimised approach 6ms TC-O(2N)
  /*  public int lengthOfLongestSubstring(String s) {
        int l=0;int maxlen=0;
        Set<Character>hs=new HashSet<>();
        for(int r=0;r<s.length();r++)
        {
           
                while (hs.contains(s.charAt(r))) {
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(s.charAt(r));
                maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;     
    }*/
    
    //5ms TC-O(N)
   /*  public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0;
        int maxlen = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

         for(r=0;r<s.length();r++){
            char currentChar = s.charAt(r);
            if (hm.containsKey(currentChar))
       //agr woh char present hai toh l ko uske aage wale index pr set karo         
            {
                l = Math.max(hm.get(currentChar) + 1, l);  // Ensure 'l' only moves forward
                //We calculate the window size as r - l + 1, and the l pointer ensures that only characters in the current valid window are considered hashmap old values wont interfere
            }
            hm.put(currentChar, r);
            maxlen = Math.max(maxlen, r - l + 1);
          
        }

        return maxlen;*/
    }
}