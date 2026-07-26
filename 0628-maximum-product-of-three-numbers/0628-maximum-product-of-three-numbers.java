class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1  ; 
        int a  = nums[n] * nums[n-1 ] * nums[n - 2];
        int b  = nums[0] * nums[1] * nums[n];
    return Math.max(a , b);
    }
}