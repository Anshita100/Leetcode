class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        paths(ans, path, root, targetSum);
        return ans;
    }

    public void paths(List<List<Integer>> ans, List<Integer> path, TreeNode root, int target) {
        if (root == null) return;

        // Add the current node's value to the path
        path.add(root.val);

        // If it's a leaf node and the path sum equals the target, add the path to the result
        if (root.left == null && root.right == null && target == root.val) {
            ans.add(new ArrayList<>(path));
        } else {
            // Continue exploring left and right subtrees
            paths(ans, path, root.left, target - root.val);
            paths(ans, path, root.right, target - root.val);
        }

        // Backtrack: remove the last added node when going up the tree
        path.remove(path.size() - 1);
    }
}
