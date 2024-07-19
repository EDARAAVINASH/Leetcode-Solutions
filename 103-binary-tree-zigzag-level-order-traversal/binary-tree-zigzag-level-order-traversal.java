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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> al=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) return al;
        queue.add(root);
        boolean direc=true;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            List<Integer> row=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=queue.poll();
                if(temp!=null)
                {
                    if(temp.left!=null)
                        queue.add(temp.left);
                    if(temp.right!=null)
                        queue.add(temp.right);
                    if(!direc)
                    {
                        row.add(0,temp.val);
                    }
                    else
                    {
                        row.add(temp.val);
                    }
                }
            }
            al.add(row);
            direc=!direc;
        }  
        return al;  
    }
}