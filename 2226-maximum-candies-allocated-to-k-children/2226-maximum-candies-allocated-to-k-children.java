class Solution {
    public int maximumCandies(int[] candies, long k) {
        int start = 1;
        int end = Integer.MIN_VALUE;

        // Find the maximum value in the candies array
        for (int candy : candies) {
            if (candy > end) {
                end = candy;
            }
        }

        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canAllocate(candies, mid, k)) {
                ans = mid;  // mid is a valid answer, try for a larger value
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public boolean canAllocate(int[] candies, int candy, long child) {
        long currentChild = 0;
        for (int i = 0; i < candies.length; i++) {
            currentChild += candies[i] / candy;
            if (currentChild >= child) {  // Early exit if we meet or exceed required children
                return true;
            }
        }
         
       return false;
    }
}
