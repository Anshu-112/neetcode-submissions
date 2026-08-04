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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
    return;
}
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode temp = slow.next;
        slow.next=null;

        ListNode prev = null;
        ListNode curr = temp;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        
        }

     ListNode t1 = head;
ListNode t2 = prev;

while(t1!=null && t2!=null){
    ListNode next1 = t1.next;
    ListNode next2 = t2.next;
 t1.next = t2;
 t2.next = next1;
 t1 = next1;
t2 = next2;


}




        
    
    }
}
