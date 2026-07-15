class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even = 0 ; 
        int odd = 0 ; 
        for(int i = 1 ; i <= n ; i ++){
             odd += (2 * i - 1);
             even += (2 * i);
        }
       return gcd(even , odd ); 
    }
    public int gcd(int a , int b ){
        if( a == 0 || b == 0 ){
            return Math.max(a , b );
        }
        int result = Math.min(a , b );
        while(result > 0 ){
            if(a % result == 0 && b % result == 0 ){
                return result ;
            }
            result--;
        }
    return 1  ; }
}