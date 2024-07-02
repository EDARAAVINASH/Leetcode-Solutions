/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> s1=new Stack();
        while(headA!=null)
        {
            s1.push(headA);
            headA=headA.next;
        }
        Stack<ListNode> s2=new Stack();
        while(headB!=null)
        {
            s2.push(headB);
            headB=headB.next;
        }
        ListNode ans=null;
        while(!s1.isEmpty() && !s2.isEmpty() && s1.peek()==s2.peek())
        {
            ans=s1.pop();
            s2.pop();
        }
        return ans;
    }
}