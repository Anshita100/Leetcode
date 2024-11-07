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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);  // Marker for the end of the level
        
        List<Integer> currentLevel = new ArrayList<>();
        
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            
            if (curr == null) {
                // End of current level, add the current level to the result
                ans.add(new ArrayList<>(currentLevel));
                currentLevel.clear();  // Reset for the next level
                
                if (!q.isEmpty()) {
                    q.add(null);  // Add marker for next level
                }
            } else {
                // Add current node's value to the current level
                currentLevel.add(curr.val);
                
                // Add children to the queue
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        
        return ans;
    }
}
