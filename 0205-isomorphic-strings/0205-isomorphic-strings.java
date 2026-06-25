class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for(int i = 0 ; i < t.length() ; i++){
            char c = s.charAt(i);
            char b = t.charAt(i);
            if(m1[c] != m2[b] ){
                return false ; 
            }
            else{
                m1[c] = i + 1 ; 
                m2[b] = i + 1 ; 
            }
        }
    return true ; }
}