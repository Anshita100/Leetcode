import java.util.*;

class Solution {
    public TreeNode canMerge(List<TreeNode> trees) {
        // Edge case: if there's only one tree, just return it if it's a valid BST
        if (trees.size() == 1) {
            TreeNode singleTree = trees.get(0);
            return isValidBST(singleTree, Integer.MIN_VALUE, Integer.MAX_VALUE) ? singleTree : null;
        }

        // Store each tree root in a map by value for easy access
        Map<Integer, TreeNode> treeMap = new HashMap<>();
        Set<Integer> leaves = new HashSet<>();

        // Populate the tree map and collect leaves
        for (TreeNode root : trees) {
            treeMap.put(root.val, root);
            collectLeaves(root, leaves);
        }

        // Try to merge all trees into one root
        TreeNode root = null;
        for (TreeNode tree : trees) {
            // Start from a root that isn't a leaf
            if (!leaves.contains(tree.val)) {
                root = tree;
                break;
            }
        }

        // If no root was found, return null (invalid case)
        if (root == null) return null;

        // Remove the root from the map as we will start merging here
        treeMap.remove(root.val);

        // Attempt to merge remaining trees into this root
        if (!dfsMerge(root, treeMap) || !treeMap.isEmpty()) {
            return null;
        }

        // Validate the final merged tree as a BST
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE) ? root : null;
    }

    // Helper function to collect all leaf values
    private void collectLeaves(TreeNode node, Set<Integer> leaves) {
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
        }
        if (node.left != null) collectLeaves(node.left, leaves);
        if (node.right != null) collectLeaves(node.right, leaves);
    }

    // Depth-First Search to merge trees by connecting leaves to roots
    private boolean dfsMerge(TreeNode node, Map<Integer, TreeNode> treeMap) {
        if (node == null) return true;

        if (node.left != null && treeMap.containsKey(node.left.val)) {
            node.left = treeMap.remove(node.left.val); // Attach the subtree
            if (!dfsMerge(node.left, treeMap)) return false; // Continue merging
        }

        if (node.right != null && treeMap.containsKey(node.right.val)) {
            node.right = treeMap.remove(node.right.val); // Attach the subtree
            if (!dfsMerge(node.right, treeMap)) return false; // Continue merging
        }

        return true;
    }

    // Helper function to validate BST property
    private boolean isValidBST(TreeNode node, int min, int max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
