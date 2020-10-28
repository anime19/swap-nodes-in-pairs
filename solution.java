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
        boolean b= true;
        ListNode p=head; int t;
        while( p.next!=null) {
            if(b){
                t=p.val;
                p.val=p.next.val;
                p.next.val=t;
                p=p.next;
            }
        else p=p.next;
        b=!b;
        }
    
   return head;

    }
}
