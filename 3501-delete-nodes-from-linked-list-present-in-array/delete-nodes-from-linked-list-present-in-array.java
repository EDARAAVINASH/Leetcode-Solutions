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
    public ListNode modifiedList(int[] nums, ListNode head) 
    {
        Set<Integer> set=new HashSet();
        for(int i:nums)
        {
            set.add(i);
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp=head;
        ListNode curr=dummy;
        while(temp!=null)
        {
            if(!set.contains(temp.val))
            {
                dummy.next=temp;
                dummy=dummy.next;
            }
            temp=temp.next;
        }
        dummy.next=null;
        return curr.next;
    }
}