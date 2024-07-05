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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int i = 1 ;
        int pcount = 0 ;
        int firstcount = 0 ;
        ListNode curr = head.next ;
        ListNode prev = head ;
        int minD = Integer.MAX_VALUE ;
        int maxD = Integer.MIN_VALUE;
        while(curr.next != null){
            if(curr.val > prev.val && curr.val > curr.next.val || curr.val < prev.val && curr.val < curr.next.val){

                if(firstcount == 0){
                    pcount = i ;
                    firstcount = i ;
                }
                else{
                    minD = Math.min(minD,i-pcount) ;
                    pcount = i ;
                }
            }
                i++ ;
                prev = curr ;
                curr = curr.next ;
        }
        if(minD == Integer.MAX_VALUE){
            int[] ans = {-1,-1} ;
            return ans ;
        }
         int[] ans = {minD,pcount-firstcount} ;
         return ans ;
    }
}
