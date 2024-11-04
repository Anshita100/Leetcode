import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize a HashMap to store grouped anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert string to char array, sort it, and convert back to a string
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            
            // Check if this sorted version is already a key in the map
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            
            // Add the original string to the list corresponding to the sorted key
            map.get(sorted).add(s);
        }
        
        // Return all the values in the map, which are lists of anagram groups
        return new ArrayList<>(map.values());
    }
}
