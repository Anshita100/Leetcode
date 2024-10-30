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
    public void goodnodestravel(TreeNode root, int maxSoFar, int[] count) {
        if (root == null) {
            return;
        }
        // Check if the current node is a "good node"
        if (root.val >= maxSoFar) {
            count[0]++;
            maxSoFar = root.val; // Update the maxSoFar to current node's value
        }
        // Traverse left and right subtrees
        goodnodestravel(root.left, maxSoFar, count);
        goodnodestravel(root.right, maxSoFar, count);
    }

    public int goodNodes(TreeNode root) {
        int[] count = {0}; // Using an array to store the count, so it can be modified in recursion
        goodnodestravel(root, root.val, count); // Start with root value as the initial max
        return count[0];
    }
}
