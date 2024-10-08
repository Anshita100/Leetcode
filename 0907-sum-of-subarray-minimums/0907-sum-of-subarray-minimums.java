class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long sum = 0;
        int mod = 1_000_000_007;
        
        // Arrays to store the next smaller and previous smaller indices
        int[] nextSmaller = new int[n];
        int[] prevSmaller = new int[n];
        
        // Stack for finding the next smaller element
        Stack<Integer> stack = new Stack<>();
        
        // Find the next smaller element for each element
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                nextSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }
        
        // All remaining elements in the stack have no smaller element to their right
        while (!stack.isEmpty()) {
            nextSmaller[stack.pop()] = n; // Using n as a boundary
        }
        
        // Reset stack for finding the previous smaller element
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        
        // Find the previous smaller element for each element
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                prevSmaller[stack.pop()] = i;
            }
            stack.push(i);
        }
        
        // All remaining elements in the stack have no smaller element to their left
        while (!stack.isEmpty()) {
            prevSmaller[stack.pop()] = -1; // Using -1 as a boundary
        }
        
        // Calculate the sum of subarray minimums
        for (int i = 0; i < n; i++) {
            long leftCount = i - prevSmaller[i];
            long rightCount = nextSmaller[i] - i;
            sum = (sum + (leftCount * rightCount % mod) * arr[i] % mod) % mod;
        }
        
        return (int) sum;
    }
}