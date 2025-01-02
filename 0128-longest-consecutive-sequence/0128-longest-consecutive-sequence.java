import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] a) {
        if (a.length <= 1) {
            return a.length;
        }
        
        Arrays.sort(a); // Sort the array
        int count = 1, maxCount = 1;
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                // Skip duplicates
                continue;
            }
            if (a[i] == a[i - 1] + 1) {
                // If consecutive, increment count
                count++;
            } else {
                // Reset count if sequence breaks
                count = 1;
            }
            // Update maxCount
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}
