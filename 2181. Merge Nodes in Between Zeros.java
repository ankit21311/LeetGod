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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0) ;
        ListNode result = dummy ;
        ListNode temp = head.next ;

        while(temp != null){
            int sum = 0 ;
            while(temp != null && temp.val != 0){
                sum += temp.val ;
                temp = temp.next;
            }
            result.next = new ListNode(sum) ;
            result = result.next ;

            if(temp != null){
                temp = temp.next;
            }
        }
        return dummy.next ;
    }
}
