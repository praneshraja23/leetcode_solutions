/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder str=new StringBuilder();
        helper(root,str);
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }

    public void helper(TreeNode node,StringBuilder str)
    {
        if(node==null)
        {
            str.append("null"+",");
            return ;
        }
        str.append(String.valueOf(node.val)+",");
        helper(node.left,str);
        helper(node.right,str);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] str=data.split(",");
        List<String> list=new ArrayList<>( Arrays.asList(str));
        Collections.reverse(list);
        return helper2(list);
    }
    public TreeNode helper2(List<String> list)
    {   String st=list.remove(list.size()-1);
        if(st.charAt(0)=='n')
        {
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(st));
        node.left=helper2(list);
        node.right=helper2(list);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));