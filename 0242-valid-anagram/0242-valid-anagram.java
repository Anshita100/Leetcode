import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
         /*7ms
        O(n log n), where n is the length of the string, because sorting takes O(n log n) time.*/
   /*     s = s.toLowerCase();
        t = t.toLowerCase();
        
        // Check if lengths match
        if (s.length() != t.length()) {
            return false;
        }
        
        // Convert to char arrays
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        
        // Sort the char arrays
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        
        // Check if sorted arrays are equal
        boolean result = Arrays.equals(sCharArray, tCharArray);
        return result;*/
        
         if (s.length() != t.length()) return false;
        
        // Create a frequency array of size 26 (for lowercase English letters)
        int[] charCount = new int[26];
        
        // Count characters for string s and t
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }
        
        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) return false;
        }
        
        return true;
    
    }
}
