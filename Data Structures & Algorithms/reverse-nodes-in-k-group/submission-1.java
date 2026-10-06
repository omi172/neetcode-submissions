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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode h = head;
        int group = 0;
        while(h != null && group < k){
            h = h.next;
            group++;
        }
        if(group == k){
            h = reverseKGroup(h,k);
            while(group-- > 0){
                ListNode tmp = head.next;
                head.next = h;
                h = head;
                head = tmp;
            }
            head = h;
        }
        return head;
    }
}
