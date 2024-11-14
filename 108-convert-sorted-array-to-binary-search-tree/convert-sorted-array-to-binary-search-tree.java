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
    TreeNode root;
    public TreeNode sortedArrayToBST(int[] nums) {
         BST(nums,0,nums.length-1);
         return root;
    }
    public void BST(int[] arr,int start,int end)
    {
        if(start>end)
        {
            return;
        }
        int mid=start+(end-start)/2;
        insert(arr[mid]);
        BST(arr,start,mid-1);
        BST(arr,mid+1,end);
    }
    public void insert(int val)
    {
        root=insertNode(root,val);
    }
    public TreeNode insertNode(TreeNode node,int val)
    {
        if(node==null)
        {
            node=new TreeNode(val);
            return node;
        }
        if(val<node.val)
        {
            node.left=insertNode(node.left,val);
        }
        if(val>node.val)
        {
            node.right=insertNode(node.right,val);
        }
        return node;
    }
}