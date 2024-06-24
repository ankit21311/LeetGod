import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.    
        HashMap<Integer,Integer> map = new HashMap<>() ;

        int count = 0 ;
        int sum = 0 ;
        for(int i : arr){
            sum += i ;
            if(sum == s){
                count++ ;
            }

            if(map.containsKey(sum-s)){
                count += map.get(sum-s);
            }

            if(!map.containsKey(sum)){
                map.put(sum,0) ;
            }
            map.put(sum,map.get(sum)+1) ;
            
        }
        return count ;
    }
}
