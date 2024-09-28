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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        if(head==null || k<=1)
        {
            return head;
        }
        ListNode temp=head;
        ListNode prevlast=null;
        while(temp!=null)
        {
            ListNode kthnode=findkth(temp,k);
            if(kthnode==null)
            {
                if(prevlast!=null)
                {
                    prevlast.next=temp;
                }
                break;
            }
            ListNode after=kthnode.next;
            kthnode.next=null;
            reverse(temp);
            if(temp==head)
            {
                head=kthnode;
            }
            else
            {
                prevlast.next=kthnode;
            }
            prevlast=temp;
            temp=after;
        }
        return head;
    }
    public static ListNode findkth(ListNode head,int k)
    {
        ListNode temp=head;
        while(temp!=null && --k>0)
        {
            temp=temp.next;
        }
        return temp;
    }
    public static ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode aft=curr.next;
            curr.next=prev;
            prev=curr;
            curr=aft;
        }
        return curr;
    }
}