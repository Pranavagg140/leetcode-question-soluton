class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.getOrDefault(arr[i] , 0 )+1 );
            }
            else{
                map.put(arr[i] , 1 );
            }

        }
        int ans = -1 ; 
        for(int c : map.keySet() ){
            if(c == map.get(c)){
                ans = Math.max(ans , c);
            }
        }
        
    return ans ; }
}