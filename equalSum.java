public  int equalSum(int[] arr){
        
        int i =0;
        int j = arr.length -1;
        int right = 0;
        int left  = 0;
        
        if(j < 2)
            return -1;
        
        left += arr[i];
        right += arr[j];
        while(true){
        

            if(i+1 == j-1){
                if(left == right)
                    return i+1;
                else
                    return -1;
            }
            
            if(right >= left){
                i++;
                left += arr[i];
            }else{
                j--;
                right += arr[j];
            }
            
            
        }
        
    }
