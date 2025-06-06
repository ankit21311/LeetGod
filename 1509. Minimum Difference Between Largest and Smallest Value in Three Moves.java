class Solution {
    public int minDifference(int[] nums) {
        
        int n = nums.length ;
        if(n <= 4){
            return 0 ;
        }
        Arrays.sort(nums) ;
        int case1 = nums[n-1] - nums[3] ;
        int case2 = nums[n-4] - nums[0] ;
        int case3 = nums[n-2] - nums[2] ;
        int case4 = nums[n-3] - nums[1] ;

        int ans1 = Math.min(case1,case2) ;
        int ans2 = Math.min(case3,case4) ;

        int ans = Math.min(ans1,ans2) ;
        return ans ;
    }
}
