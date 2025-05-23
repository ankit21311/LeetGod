class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer,Integer> map = new HashMap<>() ;
        int value = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            int curr = arr[i] ;
            int prev = curr - difference  ;
            int length = map.getOrDefault(prev,0) + 1 ;
            map.put(curr,length) ;
            
            value = Math.max(value,length) ;
            
        }
        return value ;
    }
}
