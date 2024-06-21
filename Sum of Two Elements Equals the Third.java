import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static  ArrayList<Integer> findTriplets(int[] arr, int n) 
    {
	    //Write your code here.
		Arrays.sort(arr) ;
		
		ArrayList<Integer> ans = new ArrayList<>() ;
		for(int i = n-1 ; i>=0 ;i--){
			int nums = arr[i] ;
			int j = 0 , k = i-1 ;
			while(j<k){
				if(arr[j]+arr[k] == nums){
					ans.add(arr[j]) ;
					ans.add(arr[k]) ;
					ans.add(arr[i]) ;
					return ans ;
				}
				else if(arr[j]+arr[k] > nums){
					k-- ;
				}else{
					j++ ;
				}
			}
		}
		return ans ;
	}
}
