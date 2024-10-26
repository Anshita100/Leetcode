class Solution {
    public int possibleStringCount(String word) {
        int totalCount = 1;
        int i = 0;
        
        while (i < word.length()) {
            int j = i;
            while (j < word.length() && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            
            int segmentLength = j - i;
            totalCount += segmentLength - 1;
            i = j;
        }
        
        return totalCount;
    }
}
