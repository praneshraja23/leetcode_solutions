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
    public void flatten(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
          return;
        Deque<TreeNode> queue=new LinkedList<>();
        if(root.left!=null)
        {
            queue.add(root.left);
        }
        if(root.right!=null)
        {
           queue.add(root.right);
        }
        TreeNode node=root;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode currentNode=queue.poll();
                if(currentNode.right!=null)
                {
                    queue.addFirst(currentNode.right);
                }
                if(currentNode.left!=null)
                {
                    queue.addFirst(currentNode.left);
                }
                node.right=currentNode;
                node.left=null;
                node=node.right;
            }
        }
    }
}