class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // Start with the first string as the initial prefix
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Check if the current prefix matches the start of the string
                prefix = prefix.substring(0, prefix.length() - 1); // Reduce the prefix length
                if (prefix.isEmpty()) {
                    return ""; // If no common prefix, return an empty string
                }
            }
        }
        return prefix;
    }
}
