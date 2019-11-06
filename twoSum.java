class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap < Integer, Integer> hm = new HashMap<Integer,Integer>();
        int[] arr = {0,0}; 
        
        for( int i  = 0; i < nums.length; i++)
            hm.put(nums[i], i);
    
        for( int i = 0; i < nums.length; i++){      
            if(hm.containsKey(target-nums[i])  ){
                if(hm.get(target-nums[i]) != i){            
                    arr[0]= i;
                    arr[1]= hm.get(target-nums[i]);
                    break;  
                }
            }
            
        }
        
        
        return arr;
        
    }
}
