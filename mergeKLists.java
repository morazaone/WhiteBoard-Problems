public ListNode mergeKLists(ListNode[] lists) {
        
         if(lists.length == 0)
            return null;
        
         ListNode hd = lists[0];
        
        ListNode hd1 =null, hd2 =null, next1 =null, next2 =null;
        int index;
        for( index = 0; index< lists.length; index++){
            
            if(lists[index]!=null){
                hd = lists[index];
                break;
            }
          
        }
        System.out.println(index);
        for( int i = index+1; i < lists.length; i++){
            if(lists[i]== null)
                continue;
            
            if(  hd.val > lists[i].val){
                hd1 = lists[i];
                hd2 =hd;
                hd = hd1;
            }else{
                hd1 = hd;
                hd2 = lists[i];
            }
            while(hd1 !=null && hd2 !=null){
                
                if(hd1.val <= hd2.val){
                   if(hd1.next == null){
                        hd1.next = hd2;
                        hd2 = null;
                    }else if(hd1.next.val >= hd2.val){
                       next2 = hd2.next;
                       next1 = hd1.next;
                       
                       hd1.next = hd2;
                       hd2.next = next1;
                      
                        hd1 = hd2;
                        hd2= next2;
                       
                   }else{
                       hd1 = hd1.next;
                   }
                }else{
                   if(hd2.next == null){
                       hd2.next =hd1;
                       hd2 = null;
                   }else if(hd2.next.val > hd1.val || hd1.val == hd2.val){
                       next1 = hd1.next;
                       next2 = hd2.next;
                       hd1.next =hd2;
                       hd1 = hd2;
                       hd1.next = next1;
                       hd2 = next2;
                   }else{
                       hd2 =hd2.next;
                   }
                }
                
            }
                 
        }
        
      
            
        return hd;
    }
