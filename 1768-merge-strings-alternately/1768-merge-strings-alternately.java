class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length() ; 
        int n = word2.length() ;
        int i = 0 ; 
        int j = 0 ;  
        StringBuilder ans = new StringBuilder();
        while(i < m && j < n ){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i < m ){
            ans.append(word1.charAt(i));
        i++;
        }
        
        while(j < n ){
            ans.append(word2.charAt(j));
        j++;
        }
    return ans.toString(); }
}