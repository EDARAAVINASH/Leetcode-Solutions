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
        if(k==1) return head;
        List<List<ListNode>> list1=new ArrayList<>();
        List<ListNode> list2=new ArrayList<>();
        ListNode curr=head;
        ListNode dummy=new ListNode(-1);
        ListNode dummytail=dummy;
        while(curr!=null)
        {
            list2.add(curr);
            if(list2.size()==k)
            {
                list1.add(list2);
                list2=new ArrayList();
            }
            curr=curr.next;
        }
        for(List<ListNode> list3:list1)
        {
            for(int i=list3.size()-1;i>=0;i--)
            {
                dummy.next=list3.get(i);
                dummy=dummy.next;
            }
        }
        for(ListNode n:list2)
        {
            dummy.next=n;
            dummy=dummy.next;
        }
        dummy.next=null;
        return dummytail.next;
    }
}