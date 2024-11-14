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
    public int maxDepth(TreeNode root) {
        int maxdepth=findMax(root);
        return maxdepth;
    }
    public int findMax(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        int heightleft=findMax(node.left);
        int heightright=findMax(node.right);
        return Math.max(heightleft,heightright)+1;
    }
}