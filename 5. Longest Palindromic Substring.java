class Solution {
    public String longestPalindrome(String s) {
        int n = s.length() ;
        boolean[][] dp = new boolean[n+1][n+1] ;
        String ans = "" ;
        for(int L = 1 ; L<=n ; L++){
            for(int i = 0 ; L+i-1< n ; i++){
                int j = L+i-1 ;
                if(i == j){
                    dp[i][j] = true ;
                }
                else if(i+1 == j){
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) ;
                }
                else{
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) ;
                }
                if (dp[i][j] && L > ans.length()) {
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans ;
    }
}
