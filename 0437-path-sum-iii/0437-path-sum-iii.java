/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int c = 0;

    public int pathSum(TreeNode root, int targetSum) {
        count(root, targetSum, new ArrayList<>());
        return c;
    }

    public void count(TreeNode root, int targetSum, List<Long> path) { // Using Long to avoid overflow
        if (root == null)
            return;

        path.add((long) root.val); // Convert to Long to prevent overflow
        count(root.left, targetSum, path);
        count(root.right, targetSum, path);

        long sum = 0;
        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
            if (sum == targetSum)
                c++;
        }

        path.remove(path.size() - 1); // Correctly remove the last element
    }
}
