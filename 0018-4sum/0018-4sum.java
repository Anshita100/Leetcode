

class Solution {
  /*  Brute Force Approach O(n4)
  public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // If the array has fewer than 4 elements, return an empty list
        if (nums.length < 4) return ans;
        
        // Loop through all combinations of four elements
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
                        
                        // If the sum matches the target, add it to the result list
                        if (sum == target) {
                            List<Integer> a = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(a); // Sort the list to handle duplicates
                            if (!ans.contains(a)) {
                                ans.add(a);
                            }
                        }
                    }
                }
            }
        }
        
        return ans;
    }*/
        
   public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        
        // If the array has fewer than 4 elements, return an empty list
        if (n < 4) {
            return result;
        }
        
        Arrays.sort(nums);
        
        for (int i = 0; i <= n - 4; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates for the first number
            }
            
            for (int j = i + 1; j <= n - 3; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue; // Skip duplicates for the second number
                }
                
                int c = j + 1;
                int d = n - 1;
                
                while (c < d) {
                    long sum = (long) nums[i] + nums[j] + nums[c] + nums[d];
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[c], nums[d]));
                        
                        // Skip duplicates for the third number
                        while (c < d && nums[c] == nums[c + 1]) {
                            c++;
                        }
                        
                        // Skip duplicates for the fourth number
                        while (c < d && nums[d] == nums[d - 1]) {
                            d--;
                        }
                        
                        c++;
                        d--;
                    } else if (sum < target) {
                        c++;
                    } else {
                        d--;
                    }
                }
            }
        }
        
        return result;
    }
}
