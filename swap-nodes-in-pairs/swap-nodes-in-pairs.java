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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        while(curr.next!=null && curr.next.next!=null)
        {
            ListNode firstnexttocurr=curr.next;
            ListNode secondnexttocurr=curr.next.next;
             curr.next=secondnexttocurr;
             firstnexttocurr.next=secondnexttocurr.next;
             secondnexttocurr.next=firstnexttocurr;
             curr=curr.next.next;
        }
        return dummy.next;
    }
}