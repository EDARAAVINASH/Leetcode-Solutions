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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(head!=null)
        {
            if(head.val==0)
            {
                int sum=0;
                head=head.next;
                while(head!=null && head.val!=0)
                {
                    sum=sum+head.val;
                    head=head.next;
                }
                if(sum!=0)
                {
                    curr.next=new ListNode(sum);
                }
                curr=curr.next;
            }
            else
            {
                head=head.next;
            }
        }
        return dummy.next;
    }
}