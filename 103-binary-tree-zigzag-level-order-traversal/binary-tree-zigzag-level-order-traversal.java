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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> lists=new ArrayList<>();
        if(root==null)
        {
            return lists;
        }
        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean rev=false;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
             for(int i=0;i<size;i++)
                {
                    if(rev)
                    {
                        TreeNode currentNode=queue.pollLast();
                        list.add(currentNode.val);
                        
                        if(currentNode.right!=null)
                        {
                            queue.addFirst(currentNode.right);
                        }
                        if(currentNode.left!=null)
                        {
                            queue.addFirst(currentNode.left);
                        }
                    }
                    else
                    {

                        TreeNode currentNode=queue.pollFirst();
                        list.add(currentNode.val);
                        if(currentNode.left!=null)
                        {
                            queue.addLast(currentNode.left);
                        }
                        if(currentNode.right!=null)
                        {
                            queue.addLast(currentNode.right);
                        }
                    }
                }
            rev=!rev;
            lists.add(list);
        }
        return lists;
    }
}