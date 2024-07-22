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
    public ListNode rotateRight(ListNode head, int k) 
    {
        int length=1;
        ListNode temp=head;
        if(head==null || k==0) return head;
        while(temp.next!=null)
        {
            length++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%length;
        ListNode prev=null;
        for(int i=0;i<=length-k-1;i++)
        {
            prev=head;
            head=head.next;
        }
        prev.next=null;
        return head;
    }
}