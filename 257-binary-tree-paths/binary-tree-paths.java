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
    public List<String> binaryTreePaths(TreeNode root) 
    {
        StringBuilder sb=new StringBuilder();
        List<String> list1=new ArrayList<>();
        path(root,list1,sb);
        return list1;    
    }
    public static void path(TreeNode root,List<String> list1,StringBuilder sb)
    {
        if(root==null) 
        {
            list1.add(sb.toString());
        }
        if(root.left==null && root.right==null) 
        {
            list1.add(sb.append(root.val).toString());
        }
        int length=sb.length();
        if(root.left!=null)
        {
            path(root.left,list1,sb.append(root.val).append("->"));
            sb.setLength(length);
        }
        if(root.right!=null)
        {
            path(root.right,list1,sb.append(root.val).append("->"));
            sb.setLength(length);
        }
    }
}