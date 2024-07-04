Approach 1
class Solution {
    public static boolean check(String s , int i , int j){
        if(i>=j){
            return true ;
        }
        if(s.charAt(i) == s.charAt(j)){
                return check(s,i+1,j-1) ;
            }
            return false ;
        
    }
    public int countSubstrings(String s) {
        int n = s.length() ;
        int count = 0 ; 
        for(int i = 0 ; i<n ; i++){
            for(int j = i ; j<n ; j++){
                if(check(s,i,j)){
                    count++ ;
                }
            }
        }
        return count ;
    }
}

Approach 2 
class Solution {
    public static boolean check(String s , int i , int j , int[][] dp){
        if(i>=j){
            return true ;
        }
        if(dp[i][j] != -1){
            return dp[i][j] == 1;
        }
        else{
            if(s.charAt(i) == s.charAt(j)){
                dp[i][j] =  check(s,i+1,j-1,dp)?1:0 ;
                return dp[i][j] == 1;
            }
        }
        return dp[i][j] == 0  ;
        
    }
    public int countSubstrings(String s) {
        int n = s.length() ;
        int count = 0 ; 
        int[][] dp = new int[n][n] ;
        for(int i = 0 ; i <n ; i++){
            for(int j = 0 ; j<n ; j++){
                dp[i][j] = -1 ;
            }
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = i ; j<n ; j++){
                if(check(s,i,j,dp)){
                    count++ ;
                }
            }
        }
        return count ;
    }
}

BEST APPROACH TEMPLATE
class Solution {
    public int countSubstrings(String s) {
        int n = s.length() ;
        int count = 0 ;
        boolean[][] dp = new boolean[n+1][n+1] ;
        for(int L = 1 ; L<=n ; L++){
            for(int i = 0 ;L+i-1 < n  ; i++){
                int j = L+i-1 ; 
                if(i == j){
                    dp[i][j] = true ;
                }
                else if(i+1 == j){
                    dp[i][j] = s.charAt(i) == s.charAt(j) ;
                }
                else{
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) ;
                }
                if(dp[i][j]){
                    count++ ;
                }
            }
        }
        return count ;
    }
}
