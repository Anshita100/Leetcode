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
        
        HashMap<Character, Integer> countMap = new HashMap<>();
        
        // Count frequency of characters in s
        for (int i = 0; i < s.length(); i++) {
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0) + 1);
            countMap.put(t.charAt(i), countMap.getOrDefault(t.charAt(i), 0) - 1);
        }
        
        // Check if all values in the map are zero
        for (int count : countMap.values()) {
            if (count != 0) return false;
        }
        
        return true;
    
        //5ms-O(N),SC-O(1)
     /*   if (s.length() != t.length()) return false;
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
        return true;*/
    
    }
}
