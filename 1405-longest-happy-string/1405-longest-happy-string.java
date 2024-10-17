class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder result = new StringBuilder();
        int[] counts = {a, b, c};
        char[] chars = {'a', 'b', 'c'};
        
        while (true) {
            // Find the most frequent character
            int maxIndex = getMaxIndex(counts);
            // Check if we can use it without violating the rule
            if (result.length() >= 2 && result.charAt(result.length() - 1) == chars[maxIndex] 
                && result.charAt(result.length() - 2) == chars[maxIndex]) {
                
                // If adding the max character would cause three in a row, find the next most frequent character
                int secondMaxIndex = getSecondMaxIndex(counts, maxIndex);
                if (counts[secondMaxIndex] == 0) {
                    break; // No valid character to add
                }
                
                // Add the second most frequent character
                result.append(chars[secondMaxIndex]);
                counts[secondMaxIndex]--;
            } else {
                // Otherwise, add the most frequent character
                if (counts[maxIndex] == 0) {
                    break; // No characters left to add
                }
                result.append(chars[maxIndex]);
                counts[maxIndex]--;
            }
        }

        return result.toString();
    }

    // Helper function to find the index of the character with the maximum count
    private int getMaxIndex(int[] counts) {
        if (counts[0] >= counts[1] && counts[0] >= counts[2]) {
            return 0;
        } else if (counts[1] >= counts[0] && counts[1] >= counts[2]) {
            return 1;
        } else {
            return 2;
        }
    }

    // Helper function to find the index of the character with the second maximum count
    private int getSecondMaxIndex(int[] counts, int maxIndex) {
        int secondMaxIndex = (maxIndex + 1) % 3;
        int thirdIndex = (maxIndex + 2) % 3;
        return counts[secondMaxIndex] >= counts[thirdIndex] ? secondMaxIndex : thirdIndex;
    
    }
}