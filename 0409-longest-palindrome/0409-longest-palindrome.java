class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;
        boolean hasOdd = false;

        for (int val : hm.values()) {
            if (val % 2 == 0) {
                ans += val;
            } else {
                ans += val - 1; // use maximum even part
                hasOdd = true;
            }
        }

        if (hasOdd) ans += 1; // one odd in center

        return ans;
    }
}
