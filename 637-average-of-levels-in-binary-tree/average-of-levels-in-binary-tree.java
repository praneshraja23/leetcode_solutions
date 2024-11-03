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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            double avg=0.0;
            for(int i=0;i<size;i++)
            {
                TreeNode currentNode=queue.poll();
                avg+=currentNode.val;
                if(currentNode.left!=null)
                {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    queue.offer(currentNode.right);
                }
            }
            avg=avg/size;
            list.add(avg);
        }
        return list;
    }
}