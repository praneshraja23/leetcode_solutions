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
class FindElements {
    private TreeNode root;
    public FindElements(TreeNode root) {
        if(root==null)
        {
            this.root=null;
            return;
        }
        root.val=0;
        this.root=helper(root);
    }
    
    public boolean find(int target) {
        if(root==null)
        {
            return false;
        }
        return findVal(root,target);
    }
    public boolean findVal(TreeNode node,int target)
    {
        if(node.val==target)
        {
            return true;
        }

        boolean right=false;
        boolean left=false;
        if(node.right!=null)
        {
            right=findVal(node.right,target);
        }
        if(node.left!=null)
        {
            left=findVal(node.left,target);
        }
        return right||left;
        
    }
    public TreeNode helper(TreeNode node)
    {
        if(node==null)
        {
            return node;
        }
        if(node.left!=null)
        {
            node.left.val=(2*(node.val))+1;
        }
        if(node.right!=null)
        {
            node.right.val=(2*(node.val))+2;
        }
        node.right=helper(node.right);
        node.left=helper(node.left);
        return node;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */