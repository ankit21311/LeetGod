class Solution {
    public static int Dp(int[] nums, int[] dp , int n){
        if(n < 0){
            return 0 ;
        }
        if(dp[n] != -1){
            return dp[n] ;
        }else{
           return dp[n] = Math.max((Dp(nums,dp,n-2) + nums[n]), Dp(nums,dp,n-1)) ;
        }
    }
    public int rob(int[] nums) {
       int n = nums.length ;
       if(n == 0){
        return 0 ;
       } 
       int[] dp = new int[n] ;
       Arrays.fill(dp,-1) ;
       int ans = Dp(nums,dp,n-1) ;
       return ans ;
    }
}
