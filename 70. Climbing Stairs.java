class Solution {
    public static int Dp(int n , int[] dp){
        if(n <= 2){
            return n ;
        }
        if(dp[n] != -1){
            return dp[n] ;
        }else{
           dp[n] = Dp(n-1 , dp) + Dp(n-2 , dp) ;
           return dp[n] ;
        }
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1] ;
        for(int i = 0 ; i<n+1 ; i++){
            dp[i] = -1 ;
        }
        int ans =  Dp(n , dp) ;
        return ans ;
    }
}
