import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // Convert both strings to lowercase
        s = s.toLowerCase();
        t = t.toLowerCase();
        
        // Check if lengths match
        if (s.length() != t.length()) {
            System.out.println("Not anagram");
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
        if (result) {
            System.out.println("Is anagram");
        } else {
            System.out.println("Not anagram");
        }
        
        return result;
    }
}
