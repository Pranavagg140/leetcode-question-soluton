class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for(char c : chars.toCharArray()){
            freq[c - 'a']++;
        }
        int ans = 0 ; 
        for(String st : words){
            boolean poss = true ; 
            int[] temp = new int[26];
            for(char c : st.toCharArray()){
                temp[c - 'a']++;
                if(temp[c - 'a'] > freq[c - 'a']){
                    poss = false ; 
                    break ; 
                }
            }
        
        if(poss){
            ans += st.length();
        }
         }
    return ans ;}
}