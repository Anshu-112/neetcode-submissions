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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode dummy = new ListNode(-1);
        ListNode second = dummy;
        ListNode first = dummy;
        second.next=head;
        int i=0;

        while(i<=n){
            first=first.next;
            i++;
        }

        while(first!=null){
            second=second.next;
            first= first.next;

        }
        second.next = second.next.next;
        return dummy.next;

    }
}
