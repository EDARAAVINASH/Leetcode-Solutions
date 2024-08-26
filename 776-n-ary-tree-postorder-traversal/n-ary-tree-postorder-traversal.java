/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        if(root==null) return ans;
        stack.push(root);
        while(!stack.isEmpty())
        {
            Node curr=stack.pop();
            ans.add(curr.val);
            for(Node itr:curr.children)
            {
                stack.add(itr);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}