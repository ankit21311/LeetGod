class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        
        int maxEle = Integer.MIN_VALUE ;
        for(int i = 0 ; i<nums.length ; i++){
            maxEle = Math.max(maxEle,nums[i]) ;
        }
        int[] arr = new int[maxEle+1] ;

        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j<nums.length ; j++){
                int dif = Math.abs(nums[j]-nums[i]) ;
                arr[dif]++ ;
            }
        }
        for(int i = 0 ; i<=maxEle ; i++){

            k -= arr[i] ;

            if(k<=0){
                return i ;
            }
    }
    return -1 ;
}
}
