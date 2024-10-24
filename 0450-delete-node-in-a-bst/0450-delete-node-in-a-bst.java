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
        if (root == null) {
            return null;  // Base case: empty tree or key not found
        }
        
        // Search for the node to delete
        if (key < root.val) {
            root.left = deleteNode(root.left, key);  // Go left
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);  // Go right
        } else {
            // Node to be deleted is found
            if (root.left == null && root.right == null) {
                // Case 1: Node is a leaf, just delete it
                return null;
            } else if (root.left == null) {
                // Case 2: Node has only right child
                return root.right;
            } else if (root.right == null) {
                // Case 2: Node has only left child
                return root.left;
            } else {
                // Case 3: Node has two children
                TreeNode minNode = findMin(root.right);  // Find inorder successor
                root.val = minNode.val;  // Replace the value of the node with successor's value
                root.right = deleteNode(root.right, minNode.val);  // Delete the inorder successor
            }
        }
        
        return root;  // Return the modified root of the tree
    }
    
    // Helper function to find the minimum value in a subtree (leftmost node)
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
