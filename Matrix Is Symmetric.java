import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isMatrixSymmetric(int[][] matrix) {
        // Write your code here.
        int n = matrix.length ;
        // int m = matrix[0].length ;
        int[][] trans = new int[n][n] ;
        for(int i = 0 ;i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                trans[i][j] = matrix[j][i] ;
            }
        }
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                if(trans[i][j] != matrix[i][j]){
                    return false ;
                }
            }
        }
        return true ;
    }
}

import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isMatrixSymmetric(int[][] matrix) {
        int n = matrix.length;

        // Check if the matrix is symmetric by comparing elements directly
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}

