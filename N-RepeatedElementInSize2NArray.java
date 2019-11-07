class Solution {
    public int repeatedNTimes(int[] A) {
        HashMap <Integer, Integer> hm = new HashMap<Integer,Integer>();
       int count = 0;
        for(int i : A){
            
            if(hm.containsKey(i))
                return i;
            else
                hm.put(i,++count);
      
        }
        return -99;
    }
}
