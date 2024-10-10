class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isInvert(root.left, root.right);
    }

    public boolean isInvert(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return isInvert(left.left, right.right) && isInvert(left.right, right.left);
    }
}
