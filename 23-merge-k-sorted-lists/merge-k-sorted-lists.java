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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        for(ListNode l:lists) 
        {
            if(l!=null) 
            {
                pq.offer(l);
            }
        }
        while(!pq.isEmpty())
        {
            ListNode l=pq.poll();
            temp.next=l;
            temp=temp.next;
            if (l.next != null) 
            pq.offer(l.next);
        }
        return dummy.next;
    }
}