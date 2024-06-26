import java.util.* ;
import java.io.*; 
public class Solution {

	public static int findKthElement(int[][] matrix, int k) {
	    // Write your code here.
		int row = matrix.length ;
		int col = matrix[0].length ;

		int top = 0 , right = col-1 ;
		int down = row-1 , left = 0 ;
		int count = 0 , dir = 0 ;
		int ans = 0 ;
		while(top <= down && left <= right){
			if(dir == 0){
				for(int i = left ; i<=right ; i++){
					ans = matrix[top][i] ;
					count++ ;
					if(count == k){
						return ans ;
					}
				}
				top++ ;
			}
			else if(dir == 1){
				for(int i = top ; i<=down ; i++){
						ans = matrix[i][right] ;
						count++;
						if(count == k){
							return ans ;
						}
				}
				right-- ;
			}
			else if(dir == 2){
				for(int i = right ; i>=left ; i--){
					ans = matrix[down][i] ;
					count++ ;
					if(count == k){
						return ans ;
					}
				}
				down-- ;
			}
			else if(dir == 3){
				for(int i = down ; i>=top ; i--){
					ans = matrix[i][left] ;
					count++ ;
					if(count == k){
						return ans ;
					}
				}
				left++ ;
			}
			dir++ ;
			if(dir == 4){
				dir = 0 ;
			}
		}
		return ans ;

	}
}
