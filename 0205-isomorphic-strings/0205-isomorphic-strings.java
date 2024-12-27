class Solution {
    public boolean isIsomorphic(String s, String t) {
     /*   HashMap <Character,Character> map=new HashMap<>();
        
        int n=s.length();
        int m=t.length();
        
        if(n!=m) return false;
        
for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (map.containsKey(charS)) {//eg-s=foo,t=bar
                if (map.get(charS) != charT) {
                    return false; 
                }
            } else {
               if (map.containsValue(charT)) {//eg-s=bad,t=bab
                    return false; 
                }
                map.put(charS, charT);
            }
        }
        return true;*/
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if (mapS.containsKey(ch1)) {
                if (mapS.get(ch1) != ch2) return false;
            } else {
                mapS.put(ch1, ch2);
            }
            
            if (mapT.containsKey(ch2)) {
                if (mapT.get(ch2) != ch1) return false;
            } else {
                mapT.put(ch2, ch1);
            }
        }
        
        return true;
    }
}