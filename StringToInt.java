 
    public int stringToInt(String str) {
         if(str.length() == 0)
             return 0;
        
        int sign = 0;
        //forgot to convert string to char array
        char[] s = str.toCharArray();

        boolean started = false;
        boolean outOfBounds= false;
        
        int result = 0;
        for(char c : s){
            
            if( (c-'0') > 9 || (c-'0') < 0 && started )
                break;
            
            else if( c == '-' || c == '+' && !started){
                if(c =='-'){
                    sign = -1;
                    started = true;
                }
                else{
                    sign = 1;
                    started = true;  
                }
               
            }else if( (c-'0') >= 0 && (c - '0')<= 9){
                
                if(!started)//since we didnt read any sign we assume is positive
                    sign = 1;
               

                 if(result > (Integer.MAX_VALUE - (c-'0') )/10){
                    outOfBounds = true;

                    break; 
                }else{

                    result = ((result*10)+(c-'0'));
                     
                }
                started = true;
                  
            }
            //forgot to check for white spaces
          else if (!started && c != ' ')
            {
                result = 0;
                break;
            }
                                         
        }
 
           if(outOfBounds){
                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        
            return sign*result;
            
             
     
}
