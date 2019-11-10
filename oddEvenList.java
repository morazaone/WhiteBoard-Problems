/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            len++;
            tail = tail.next;
        }
        len = len/2;
        ListNode cur = head;
        while (len > 0) {
            tail.next = cur.next;
            cur.next = cur.next.next;
            tail = tail.next;
            cur = cur.next;
            len--;
        }
        tail.next = null;
        return head;
    }
}
