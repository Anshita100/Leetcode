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
    private int count = 0; // Use a count variable to track the number of nodes visited
    private int result = -1; // Store the result once the kth smallest element is found

    public int kthSmallest(TreeNode root, int k) {
        count = 0; // Reset count for each call to kthSmallest
        result = -1; // Reset result for each call
        inOrder(root, k); // Call the modified in-order traversal
        return result; // Return the result after traversal
    }

    private void inOrder(TreeNode node, int k) {
        if (node == null || result != -1) {
            return; // Stop recursion if result is found or node is null
        }

        // Traverse left subtree
        inOrder(node.left, k);

        // Process the current node
        count++;
        if (count == k) {
            result = node.val;
            return; // Stop further traversal once kth smallest element is found
        }

        // Traverse right subtree
        inOrder(node.right, k);
    }
}
