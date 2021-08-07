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
    public ListNode reverseList(ListNode head) {
        ListNode prevnode= null;
        ListNode curr= head;
        while(curr!=null){
            ListNode nextnode=curr.next;
            
            curr.next=prevnode;
            prevnode=curr;
            curr=nextnode;
        }
        head= prevnode;
        return head;
    }
}