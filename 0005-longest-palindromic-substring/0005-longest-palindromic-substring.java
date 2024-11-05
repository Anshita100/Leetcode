class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0, maxLen = 1;
        
        for (int i = 0; i < s.length() - 1; i++) {
            int len1 = expandFromCenter(s, i, i);       // Odd length
            int len2 = expandFromCenter(s, i, i + 1);   // Even length
            int len = Math.max(len1, len2);
            
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }
    
    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
