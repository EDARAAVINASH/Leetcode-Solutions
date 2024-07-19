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
    public int rangeSumBST(TreeNode root, int low, int high) 
    {
       return sum(root,low,high);       
    }
    public static int sum(TreeNode root,int low,int high)
    {
        int totsum=0;
        if(root==null) return 0;
        if(root.val>=low && root.val<=high)
        {
            totsum+=root.val;
        }
        if(root.val>low)
        {
            totsum+=sum(root.left,low,high);
        }
        if(root.val<high)
        {
            totsum+=sum(root.right,low,high);
        }
        return totsum;
    }
}