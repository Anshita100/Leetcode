class Solution {
 /*Brute-Force Solution:
 for i = 0 to n-3:
    for j = i+1 to n-2:
        for k = j+1 to n-1:
            if nums[i] + nums[j] + nums[k] == 0:
                add the triplet (nums[i], nums[j], nums[k]) to the result

    */
    
  //  O(n²): Sorting takes O(n log n), and the two-pointer technique runs in O(n) for each element, so the total time complexity is O(n²).
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort the array
        
        for (int i = 0; i <=nums.length - 3; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                
                if (sum == 0) {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    result.add(ans);

                    // Skip duplicates for the second element
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    // Skip duplicates for the third element
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    
                    // Move pointers after finding a valid triplet
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }
}
