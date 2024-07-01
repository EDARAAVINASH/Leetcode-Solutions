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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummyeven=new ListNode(-1);
        ListNode dummyodd=new ListNode(-1);
        ListNode dumeven=dummyeven;
        ListNode dumodd=dummyodd;
        ListNode curr=head;
        if(head==null) return head;
        int count=1;
        while(curr!=null)
        {
            if(count%2!=0)
            {
                dumodd.next=curr;
                dumodd=dumodd.next;
            }
            else
            {
                dumeven.next=curr;
                dumeven=dumeven.next;
            }
            curr=curr.next;
            count++;
        }
        dumeven.next = null;
        dumodd.next=dummyeven.next;
        return dummyodd.next;
    }
}