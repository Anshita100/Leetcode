class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Call the isInvert method directly
        return isInvert(root.left, root.right);
    }

    public boolean isInvert(TreeNode left, TreeNode right) {
        // If both nodes are null, they are mirrors
        if (left == null && right == null)
            return true;
        // If one of them is null, they are not mirrors
        if (left == null || right == null)
            return false;
        // Check if values are the same and subtrees are mirrors
        return (left.val == right.val) && isInvert(left.left, right.right) && isInvert(left.right, right.left);
    }
}
