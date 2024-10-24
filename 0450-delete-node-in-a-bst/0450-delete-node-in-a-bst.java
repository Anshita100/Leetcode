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
        return null;
    }
    
    // Search for the node to delete
    if (key < root.val) {
        root.left = deleteNode(root.left, key);
    } else if (key > root.val) {
        root.right = deleteNode(root.right, key);
    } else {
        // Node with only one child or no child
        if (root.left == null) {
            return root.right; // Return right subtree
        } else if (root.right == null) {
            return root.left; // Return left subtree
        }
        
        // Node with two children
        // Find the smallest value in the right subtree (inorder successor)
        TreeNode minNode = findMin(root.right);
        root.val = minNode.val; // Replace the value of the current node with the successor's value
        root.right = deleteNode(root.right, minNode.val); // Delete the successor
    }
    
    return root;
}

// Helper function to find the minimum value in a subtree
private TreeNode findMin(TreeNode node) {
    while (node.left != null) {
        node = node.left;
    }
    return node;
}

}
