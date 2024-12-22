class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character,Character> map=new HashMap<>();
        
        int n=s.length();
        int m=t.length();
        
        if(n!=m) return false;
        
for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (map.containsKey(charS)) {
                // Check if the current mapping is consistent
                if (map.get(charS) != charT) {
                    return false; // Conflict in mapping
                }
            } else {
                // Check if charT is already mapped to some other charS
                if (map.containsValue(charT)) {
                    return false; // Conflict in reverse mapping
                }
                // Add the mapping from charS to charT
                map.put(charS, charT);
            }
        }
        return true;
    }
}