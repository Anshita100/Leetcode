class Solution {
    public int numberOfSubstrings(String s, int k) {
        int freq[] = new int[26];
        int copy = k, c = 0;
        while (copy <= s.length()) {
            int i = 0;
            while (i < s.length()) {
                freq[s.charAt(i) - 'a']++;
                if (i >= copy) {
                    freq[s.charAt(i - copy) - 'a']--;
                }
                if (i >= copy - 1) {
                    for (int l = 0; l < 26; l++) {
                        if (freq[l] >= k) {
                            c++;
                            break;
                        }
                    }
                }
                i++;
            }
            // Reset the frequency array for the next iteration
            freq = new int[26];
            copy++;
        }
        return c;
    }
}
