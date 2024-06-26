import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int Kadane(int[] arr){
        int sum = 0 ;
        int mx = Integer.MIN_VALUE ;
        for(int i : arr){
            sum += i ;
            mx = Math.max(mx,sum) ;
            if(sum<0){
                sum = 0;
            }
        }
        return mx ;
    }
public static int maxSumRectangle(int[][] arr, int n, int m)
    {
        // Write your code here.
        int[] temp = new int[n] ;
        int maxSum = Integer.MIN_VALUE ;
        
        for(int left = 0  ; left<m ; left++){
            Arrays.fill(temp, 0);
            for(int right = left ; right<m; right++){
                for(int i = 0 ; i<n ; i++){
                    temp[i] += arr[i][right] ;
                }
            int currSum = Kadane(temp) ;
            maxSum = Math.max(currSum,maxSum) ;
            }
        }
        return maxSum ;
    }
}
