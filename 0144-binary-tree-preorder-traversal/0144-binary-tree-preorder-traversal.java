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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> my=new ArrayList<>();
        preorder(root,my);
        return my;
    }
    public void preorder(TreeNode root,List<Integer> my)
    {
        if(root==null)
        return;
        else
        { 
            my.add(root.val);  
            preorder(root.left,my);
            preorder(root.right,my);

        }
    }
}