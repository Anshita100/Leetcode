class Solution {
    class Node {
        Node[] child = new Node[26];
        boolean flag = false;

        Node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
        }
    }

    Node root = new Node();

    // Insert word into Trie
    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.child[ch - 'a'] == null) {
                curr.child[ch - 'a'] = new Node();
            }
            curr = curr.child[ch - 'a'];
        }
        curr.flag = true;  // Set flag to true at the end of the word
    }

    // Search word in Trie
    public boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.child[ch - 'a'] == null) {
                return false;
            }
            curr = curr.child[ch - 'a'];
        }
        return curr.flag;
    }

    // Word Break function using Trie and memoization
    public boolean wordBreak(String s, List<String> wordDict) {
        // Insert all words from wordDict into Trie
        for (String word : wordDict) {
            insert(word);
        }
        // Memoization map to store results of computed substrings
        Map<String, Boolean> memo = new HashMap<>();
        return canBreak(s, memo);
    }

    // Helper function with memoization
    public boolean canBreak(String s, Map<String, Boolean> memo) {
        // If substring is already computed, return result
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        // If the entire substring is found in the Trie, return true
        if (search(s)) {
            memo.put(s, true);
            return true;
        }
        // Try breaking the word at every position and check both parts
        for (int i = 1; i < s.length(); i++) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(i);
            if (search(prefix) && canBreak(suffix, memo)) {
                memo.put(s, true);
                return true;
            }
        }
        // If no valid split is found, mark substring as false
        memo.put(s, false);
        return false;
    }
}
