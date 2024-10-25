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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        
        if (root.val == key) {
            // Case 1: Node is a leaf (no children)
            if (root.left == null && root.right == null) return null;
            
            // Case 2: Node has only one child
            if (root.left == null || root.right == null) {
                return (root.left != null) ? root.left : root.right;
            }
            
            // Case 3: Node has two children
            TreeNode minInRight = findMin(root.right);  // Find inorder successor
            root.val = minInRight.val;  // Replace node value with successor's value
            root.right = deleteNode(root.right, minInRight.val);  // Delete inorder successor
        } 
        else if (root.val > key) {
            root.left = deleteNode(root.left, key);  // Recur in the left subtree
        } else {
            root.right = deleteNode(root.right, key);  // Recur in the right subtree
        }
        
        return root;
    }
    
    // Helper function to find the leftmost (minimum) node in a subtree
    public TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
