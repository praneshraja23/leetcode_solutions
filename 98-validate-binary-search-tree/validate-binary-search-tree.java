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
    public boolean isValidBST(TreeNode root) {
        return isValid(root,null,null);
    }
    public boolean isValid(TreeNode node,Integer lower,Integer higher)
    {
        if(node==null)
        {
            return true;
        }
        if(lower!=null && node.val<=lower )
        {
            return false;
        }
        if(higher!=null && node.val>=higher )
        {
            return false;
        }
        boolean left=isValid(node.left,lower,node.val);
        boolean right=isValid(node.right,node.val,higher);

        return (left && right);
    }
}