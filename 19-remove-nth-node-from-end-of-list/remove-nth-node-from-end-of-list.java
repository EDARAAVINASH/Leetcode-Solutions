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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int len=0;
        ListNode temp=head;
        ListNode temp1=head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        if(len==n) return head.next;
        for(int i=1;i<len-n;i++)
        {
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        return head;
    }
}