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

/*Iterate through the string to find segments of consecutive identical characters.
For each segment, calculate the number of original strings that could lead to this segment by adding segmentLength - 1 to the total count.
Continue until the end of the string and return the total count.*/