/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode first=head;
        ListNode second=head;
        while(first!=null&&first.next!=null){
            first=first.next.next;
            second=second.next;
            if(second==first){
                return true;
            }
        }
        return false;
    }
}