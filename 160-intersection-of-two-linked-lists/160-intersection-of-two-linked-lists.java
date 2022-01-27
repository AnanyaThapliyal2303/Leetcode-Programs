/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int lenA=0,lenB=0,i=0;
        while(tempA!=null){
            tempA=tempA.next;
            lenA++;
        }
        while(tempB!=null){
            tempB=tempB.next;
            lenB++;
        }
        tempA=headA;
        tempB=headB;
        if(lenA-lenB>0){
            while(i<lenA-lenB){
                tempA=tempA.next;
                i++;
            }
        }
        else{
            while(i<lenB-lenA){
                tempB=tempB.next;
                i++;
            }
        }
        while(tempA!=null || tempB!=null){
            if(tempA==tempB)
                return tempB;
           tempA=tempA.next;
           tempB=tempB.next;
        }
        return null;
    }
}