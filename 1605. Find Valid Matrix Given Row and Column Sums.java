Approach 1

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        
        int n = rowSum.length ;
        int m = colSum.length ;
        int[][] mat = new int[n][m] ;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                mat[i][j] = Math.min(rowSum[i],colSum[j]) ;
                int val =  mat[i][j] ;
                rowSum[i] -= val ;
                colSum[j] -= val ;
            }
        }
        return mat ;
    }
}

Approach 2
class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        
        int n = rowSum.length ;
        int m = colSum.length ;
        int[][] mat = new int[n][m] ;

        int i = 0 ; 
        int j = 0 ;
        while(i<n && j<m){

            mat[i][j] = Math.min(rowSum[i],colSum[j]) ;
            rowSum[i] -=  mat[i][j] ;
            colSum[j] -= mat[i][j] ;

            if(rowSum[i] == 0){
                i++ ;
            }
            if(colSum[j] == 0){
                j++ ;
            }
        }
        return mat ;
    }
}
