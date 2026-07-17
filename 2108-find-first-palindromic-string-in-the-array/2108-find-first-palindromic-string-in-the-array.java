class Solution {
    public String firstPalindrome(String[] words) {
        for(String s : words){
            if(ispalindrome(s)){
                return s ; 
            }
        }
    return "" ; }
    public boolean ispalindrome(String s ){
        int left = 0 ; 
        int right = s.length() - 1 ; 
        while( left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false ; 
            }
            left++;
            right--;
        }
    return true ; }
}