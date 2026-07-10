class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> setchar  = new HashSet<>();
        int left = 0 ; 
        int maxlen = 0 ; 
        for(int right = 0 ; right < s.length() ; right++){
            while(setchar.contains(s.charAt(right))){
                setchar.remove(s.charAt(left));
                left++;
            }
            setchar.add(s.charAt(right));
            maxlen = Math.max(maxlen,right-left + 1);
        }
    return maxlen;}
}