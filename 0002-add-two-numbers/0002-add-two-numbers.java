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
        ListNode l3 = new ListNode();
        ListNode head = l3;

        int c =0;
        while(l1 != null && l2!= null){
            int currSum = l1.val +l2.val +c;
            c = currSum/10;
            l3.next = new ListNode(currSum%10);
            l1 = l1.next;
            l2 = l2.next;
            l3 =  l3.next;
        }

        while(l1 != null){
            int currSum = l1.val  +c;
            c = currSum/10;
            l3.next = new ListNode(currSum%10);
            l1 = l1.next;
           
            l3 =  l3.next;
        }
        while(l2 != null){
            int currSum = l2.val  +c;
            c = currSum/10;
            l3.next = new ListNode(currSum%10);
            l2 = l2.next;
            l3 =  l3.next;
        }
        if(c!= 0){
            l3.next = new ListNode(c) ;
            l3 = l3.next;
        }
        return head.next;
    }
}