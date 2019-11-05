class Solution {
    public String defangIPaddr(String address) {
 
        
    String result = new String();
    for( char i : address.toCharArray() )
        if( i == '.')
            result+= "[.]";
        else
            result+= i;
 
        return result;
    }
}
