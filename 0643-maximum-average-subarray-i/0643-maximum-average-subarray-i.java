class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length ; 
        int maxsum = 0  ;
        int windowsum =  0 ; 
        for(int i = 0 ; i < k ; i++){
               windowsum += nums[i];
        }
        maxsum = windowsum;
        for(int a = k ; a < n ; a++){
            windowsum += nums[a];
            windowsum -= nums[a-k];
            maxsum = Math.max(windowsum , maxsum);

        } 
    return (double)maxsum / k ;}
}