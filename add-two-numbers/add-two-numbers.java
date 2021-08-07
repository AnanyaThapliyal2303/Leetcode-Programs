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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyhead=new ListNode(0);
        ListNode ans=dummyhead;
        ListNode num1=l1, num2=l2;
        int carry=0;
        while(l1!=null || l2!=null)
        {
            int x=(l1!=null )?l1.val:0;
            int y=(l2!=null )?l2.val:0;
            int cur_sum=x+y+carry;
            ans.next=new ListNode(cur_sum%10);
            carry=cur_sum/10;
            ans=ans.next;
            if(l1!=null )
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        if(carry>0)
        {
            ans.next=new ListNode(carry);
        }
        return dummyhead.next;
    }
}