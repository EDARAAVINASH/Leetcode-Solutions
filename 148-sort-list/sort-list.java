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
    public ListNode sortList(ListNode head) 
    {
        ListNode curr=head,temp=head;
        List<Integer> list1=new ArrayList<>();
        while(temp!=null)
        {
            list1.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list1);
        int i=0;
        while(curr!=null)
        {
            curr.val=list1.get(i++);
            curr=curr.next;
        }
        return head;
    }
}