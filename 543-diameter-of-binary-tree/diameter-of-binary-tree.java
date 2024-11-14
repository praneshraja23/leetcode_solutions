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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        int height=check(root);
        return diameter-1;
    }
    public int check(TreeNode node)
    {
        if(node==null)
        {
            return 0;
        }
        int heightleft=check(node.left);
        int heightright=check(node.right);
        int dia=heightleft+heightright+1;
        diameter=Math.max(diameter,dia);
        return Math.max(heightleft,heightright)+1;
    }
}