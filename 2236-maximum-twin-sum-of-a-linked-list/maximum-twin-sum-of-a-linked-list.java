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
    public int pairSum(ListNode head) 
    {
        ListNode slow=head;
        ListNode fast=head;
        ListNode start=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }  
        int maxi=Integer.MIN_VALUE;
        ListNode half=reverse(slow); 
        while(half!=null)
        {
            maxi=Math.max(half.val+start.val,maxi);
            half=half.next;
            start=start.next;
        } 
        return maxi;
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}