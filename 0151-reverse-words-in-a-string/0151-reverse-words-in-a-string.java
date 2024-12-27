class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (sb.length() > 0) {
                    st.push(sb.toString()); // Push the word to the stack
                    sb.setLength(0);       // Clear the StringBuilder
                }
                i++; // Skip the space
            } else {
                sb.append(ch);
                i++;
            }
        }

        // Push the last word to the stack if any
        if (sb.length() > 0) {
            st.push(sb.toString());
        }

        // Reconstruct the reversed string
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
            if (!st.isEmpty()) {
                result.append(" "); // Add space between words
            }
        }

        return result.toString();
    }
}
