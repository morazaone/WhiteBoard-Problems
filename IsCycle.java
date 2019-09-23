 public boolean isCycle(ListNode hd) {
        
        if(hd == null)
            return false;
        
        HashMap <ListNode,Integer> hm = new HashMap <ListNode,Integer>();
        int i =0;
        while(hd != null){
            
            if(hm.containsKey(hd)){//if we have repeated values then hashmap is really useful
                
                    return true;
            
            
            }
            
            hm.put(hd, i);
            i++;
            hd =hd.next;
            
        }
        
        return false;
        
    }
