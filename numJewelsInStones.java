class Solution {
    public int numJewelsInStones(String J, String S) {
        int total = 0;
        for(char j : J.toCharArray())
            for(char s : S.toCharArray())
                if(j == s)
                    total+=1;
            
        return total;
    }
}
