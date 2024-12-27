class Solution {
    public String reverseWords(String s) {
        //brute TC-O(n)
      /*  Stack<String> st = new Stack<>();
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

        return result.toString();*/
        
        // Split the string by spaces and remove extra spaces
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        // Iterate over words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    
    }
}
