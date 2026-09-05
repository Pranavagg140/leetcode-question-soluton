class Solution {
    //Input: nums = [1,3,5,6], target = 5
    //Output: 2
    public int searchInsert(int[] nums, int target) {
        int i = 0  ; int n = nums.length -1  ;  
        int loc = 0 ; 
        while( i <= n ){
            if(nums[i] == target ){
                return i ; 
            }
            else if (nums[i] > target ){
                return  i ; 
            }
            i++;

        }
    return n+1 ; }
}