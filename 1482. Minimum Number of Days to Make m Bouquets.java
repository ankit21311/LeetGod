class Solution {
    public static int makeBouquet(int[] bloomDay, int mid, int k){
        int consecutiveCount = 0 ;
        int bouque_count = 0 ; 
        for(int i = 0 ; i < bloomDay.length ; i++){
            if(bloomDay[i] <= mid){
                consecutiveCount++ ;
            }else{
                consecutiveCount = 0 ;
            }

            if(consecutiveCount == k){
                bouque_count++ ;
                consecutiveCount = 0 ;
            }
        }
        return  bouque_count ;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        
        int start = 0 , end = 0 ;
        for(int i = 0 ; i < bloomDay.length ; i++){
            end = Math.max(end,bloomDay[i]) ;
        }
        int mid = 0 ;
        int minDays = -1 ;
        while(start<=end){
            mid = start+(end-start)/2 ;
            if(makeBouquet(bloomDay,mid,k) >= m){
                minDays = mid ;
                end = mid - 1 ;
            }else{
                start = mid+1 ;
            }
        }
        return minDays ;
    }
}
