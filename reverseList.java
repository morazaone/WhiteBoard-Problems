public ListNode reverseList(ListNode hd) {
        
        if(hd == null)
            return null;
        
        ListNode temp = null;
        ListNode curr =   hd.next;
        hd.next  = null;
        while(curr != null){
            temp = hd;
            hd = curr;
            curr = hd.next;

            hd.next = temp;
        }
        return hd;
        
    }
