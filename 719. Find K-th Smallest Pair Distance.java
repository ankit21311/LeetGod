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

// Approach 2 
class Solution {
    public int SlideWindownCount(int[] nums,int D){

        int i = 0 ;
        int j = 1 ;
        int n = nums.length ;
        int PairCount = 0 ;
        while(j<n){
            while(nums[j]-nums[i] > D){
                i++ ;
            }
            PairCount += (j-i) ;
            j++ ;
        }
        return PairCount ;
    }
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums) ;
        int n = nums.length ;
        int l = 0 ;
        int r = nums[n-1]-nums[0] ;
        int result = 0 ;
        while(l<=r){
            int mid = l+(r-l)/2 ;
            int PairCount = SlideWindownCount(nums,mid) ;
            if(PairCount < k){
                l = mid+1 ;
            }
            else{
                result = mid ;
                r = mid-1 ;
            }
        }
        return result ;
    }
}
