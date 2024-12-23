class Solution {
    public int characterReplacement(String s, int k) {
    //brute approach TC-0(n*n) Time limit exceed error
      /*  int n=s.length();int maxlen=0;
        for(int i=0;i<n;i++)
        {
            int freq[]=new int[26];int maxfreqinstring=0;
            for(int j=i;j<n;j++)
            {
                maxfreqinstring=Math.max(maxfreqinstring,++freq[s.charAt(j)-'A']);
                int changes=(j-i+1)-maxfreqinstring;
                if(changes<=k) 
                    maxlen=Math.max(maxlen,j-i+1);
                else
                    break;
            }
        }
        return maxlen;*/
        
 /*  //   public int characterReplacement(String s, int k) {
    int l = 0, r = 0;
    HashMap<Character, Integer> hm = new HashMap<>();
    int maxfreq = 0, maxlen = 0;

    while (r < s.length()) {
        // Update frequency of the current character
        char currChar = s.charAt(r);
        hm.put(currChar, hm.getOrDefault(currChar, 0) + 1);

        // Update max frequency in the current window
        maxfreq = Math.max(maxfreq, hm.get(currChar));

        // Calculate the number of changes needed
        int changes = (r - l + 1) - maxfreq;

        // If changes exceed k, shrink the window from the left
        if (changes > k) {
    char leftChar = s.charAt(l);
    hm.put(leftChar, hm.get(leftChar) - 1);
    l++;

    // Recalculate maxfreq (Optional, only for theoretical correctness)
    maxfreq = 0;
    for (int freq : hm.values()) {
        maxfreq = Math.max(maxfreq, freq);
    }
}


        // Update the maximum length of the valid window
        maxlen = Math.max(maxlen, r - l + 1);

        // Expand the window
        r++;
    }

    return maxlen;
}*/
//public int characterReplacement(String s, int k) {
    int[] freq = new int[26]; // Array to store frequencies of characters
    int l = 0, maxfreq = 0, maxlen = 0;

    for (int r = 0; r < s.length(); r++) {
        // Update frequency of the current character
        char currChar = s.charAt(r);
        freq[currChar - 'A']++;

        // Update max frequency in the current window
        maxfreq = Math.max(maxfreq, freq[currChar - 'A']);

        // Check if the number of changes needed exceeds k
        int changes = (r - l + 1) - maxfreq;
        if (changes > k) {
            // Shrink the window from the left
            char leftChar = s.charAt(l);
            freq[leftChar - 'A']--;
            l++;
        }

        // Update the maximum length of the valid window
        maxlen = Math.max(maxlen, r - l + 1);
    }

    return maxlen;
}

}