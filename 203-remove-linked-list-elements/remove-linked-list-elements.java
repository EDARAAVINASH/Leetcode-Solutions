/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        {
            return head;
        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(head!=null)
        {
            if(head.val==val)
            {
                head=head.next;
            }
            else
            {
                curr.next=new ListNode(head.val);
                curr=curr.next;
                head=head.next;
            }
        }
        curr.next=null;
        return dummy.next;
    }
}