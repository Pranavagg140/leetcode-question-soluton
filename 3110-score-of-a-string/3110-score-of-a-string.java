class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int sum = 0 ;
        int diff = 0 ;
        int a ; 
        int b ;   
        for(int i = 0 ; i < n-1 ; i++){
            a = s.charAt(i) ; 
            b = s.charAt(i+1);
            diff = a - b ;
            if(diff < 0 ){
                diff *= -1 ;}
            sum += diff ;     
        }
    return sum ; }
}