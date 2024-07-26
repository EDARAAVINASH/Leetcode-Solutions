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
    static int maximum=Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) 
    {
        int[] ans=new int[1];
        diam(root,ans);
        return ans[0];
    }
    public static int diam(TreeNode root,int[] ans)
    {
        if(root==null) return 0;
        int left=diam(root.left,ans);
        int right=diam(root.right,ans);
        ans[0]=Math.max(ans[0],left+right);
        return Math.max(left,right)+1;   
    }
}