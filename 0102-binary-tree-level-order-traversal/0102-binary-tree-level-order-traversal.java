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
/*   2ms
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
}*/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans; // Early exit for empty tree
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); // Use offer() for better performance
        
        while (!q.isEmpty()) {
            int levelSize = q.size(); // Get the number of nodes at the current level
            List<Integer> currentLevel = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll(); // Dequeue node
                currentLevel.add(curr.val); // Add the node's value
                
                // Enqueue left and right children if they exist
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
            
            ans.add(currentLevel); // Add the current level's result to the final answer
        }
        
        return ans;
    }
}

//1ms
/*class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> result=new ArrayList<>();
       
        if(root==null) return result;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            
            List<Integer> currlevellist=new ArrayList<>();
            for(int i=size;i>0;i--)
            {
                TreeNode curr=q.remove();
                currlevellist.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                
            }
            result.add(currlevellist);
        }
        return result;
    }
}*/