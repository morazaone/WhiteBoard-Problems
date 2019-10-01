/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        boolean addition = false;
        ListNode hd = new ListNode(0);
        ListNode curr = hd;
        ListNode temp = null;
        
        int val1 = 0, val2 = 0, total =0;
        while(l1 != null || l2 != null || addition){
            
            if(l1 == null && l2 == null){
                val1 = 0;
                val2 = 0;
            }else if( l1 == null){
                val1 = 0; 
                val2 = l2.val; 
                l2 = l2.next;
            }else if(l2 == null ){
                val2 = 0; 
                val1 = l1.val; 
                l1 = l1.next;
            }else{
                val1 = l1.val;
                val2 = l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            total = val1 + val2;
            if(addition)
                total++;
                        
            if(total > 9){
                total = total%10;
                addition = true;
            }else
                addition = false;
            

            curr.val = total;
            
            if(addition || l1 !=null || l2 != null ){
            temp = new ListNode(0);
            curr.next = temp;
            curr = curr.next;  
            }
       
        }
         

        return hd;
        
    
}
