class Solution {
    public int minIncrementForUnique(int[] nums) {
        int n = nums.length ; 
        if(n == 1){
            return 0 ;
        }
        int count = 0 ;
        int increment = 0 ;
        Arrays.sort(nums) ;
        for(int i = 1 ; i<n ; i++){
                if(nums[i] <= nums[i-1]){
                    increment = nums[i-1] - nums[i]+1 ;
                    nums[i] +=  increment ;
                    count +=  increment ;
                }
        }
        return count ;
    }
}
