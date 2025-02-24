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
    public TreeNode recoverFromPreorder(String traversal) {
        List<Integer> vals=new ArrayList<>();
        List<Integer> depth=new ArrayList<>();
        int len=traversal.length(),count=0;
        char[] ch=traversal.toCharArray();

        for(int i=0;i<len;)
        {
            if(ch[i]!='-')
            {   
                int val=0;
                while(i<len && ch[i]!='-')
                {
                    val=(10*val)+(int)(ch[i]-'0');
                    i++;
                }
                vals.add(val);
                depth.add(count);
                count=0;
                continue;
            }
            count++;
            i++;
        }
        
        return helper(vals,depth,vals.get(0),depth.get(0),-1);
    }
    public TreeNode helper(List<Integer> vals,List<Integer> depths,int val,int depth,int lastDepth)
    {
    
        if(depth<=lastDepth)
        {
            return null;
        }
        TreeNode node=new TreeNode(val);
        vals.remove(0);
        depths.remove(0);
        if(vals.size()>0)
        {
           node.left=helper(vals,depths,vals.get(0),depths.get(0),depth);
        }
        if(vals.size()>0)
        {
            node.right=helper(vals,depths,vals.get(0),depths.get(0),depth);
        }
        return node;
    }


}