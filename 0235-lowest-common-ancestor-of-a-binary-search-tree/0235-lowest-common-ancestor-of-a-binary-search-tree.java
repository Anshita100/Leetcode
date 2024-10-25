/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Traverse the tree
        while (root != null) {
            // If both p and q are smaller than root, LCA is in the left subtree
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            }
            // If both p and q are greater than root, LCA is in the right subtree
            else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            }
            // If we find the split point, this is the LCA
            else {
                return root;
            }
        }
        return null; // Just a safety return statement, execution should never reach here
    }
}