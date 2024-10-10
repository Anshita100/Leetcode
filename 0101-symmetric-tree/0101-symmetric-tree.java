class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isInvert(root.left, root.right) || isSame(root);
    }

    public boolean isInvert(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        return (left.val == right.val) && isInvert(left.left, right.right) && isInvert(left.right, right.left);
    }

    public boolean isSame(TreeNode root) {
    if (root == null) return true;
    // If either left or right is null and the other isn't, return false
    if (root.left == null && root.right != null || root.left != null && root.right == null)
        return false;
    // If both left and right are not null, check their values
    if (root.left != null && root.right != null && root.left.val != root.right.val)
        return false;
    // Recursively check the left and right subtrees
    return isSame(root.left) && isSame(root.right);
}

}
