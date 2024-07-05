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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode curr=head.next;
        ListNode prev=head;
        int i=1,idx=-1,min1=Integer.MAX_VALUE,prev1=-1;
        while(curr.next!=null)
        {
            if(curr.val>prev.val && curr.val>curr.next.val ||
                curr.val<prev.val && curr.val<curr.next.val)
            {
                if(idx==-1)
                {
                    idx=i;
                }
                else
                {
                    min1=Math.min(i-prev1,min1);
                }
                prev1=i;
            }
            i++;
            prev=curr;
            curr=curr.next;
        }
        if(idx==-1 || prev1==idx)
        {
            return new int[]{-1,-1};
        }
        return new int[]{min1,prev1-idx};
    }
}