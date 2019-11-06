/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null && l2 == null){
            return null;
        }
        
        ListNode ans = null;
        ListNode hd = null;
        int carry = 0;
       
        while(l1 != null || l2 != null){
            int sum = carry;
            
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            
            if(sum > 9){
                sum = sum - 10;
                carry = 1;
            }else{
                carry = 0;
            }
            
            
            ListNode temp = new ListNode(sum);
            temp.next = null;
            
            if(hd == null){
                hd = temp;
            }else{
                ans.next = temp;
            }
            
            ans = temp;
            
        }
        
        if(carry == 1){
            ListNode temp = new ListNode(1);
            temp.next = null;
            ans.next = temp;
        }
        
        return hd;
        
    }
}
