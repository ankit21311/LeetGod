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



class Solution {
    public static int countDays(int[] bloomDay, int mid , int k){
        int adjacentcount = 0 ;
        int bouquecount = 0 ;
        for(int i = 0 ; i<bloomDay.length ; i++){
            if(bloomDay[i] <= mid){
                adjacentcount++ ;
            }else{
                 adjacentcount = 0 ;
            }
            if( adjacentcount == k){
                bouquecount++ ;
                adjacentcount = 0;
            }
        }
        return  bouquecount ;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        
        int start = 0 , end = 0 ;
        int n = bloomDay.length ;
        for(int i = 0 ; i<n ; i++){
            end = Math.max(bloomDay[i],end) ;
        }
        int ans = -1 ;
        while(start <= end){
            int mid = start + (end-start)/2 ;
            if(countDays(bloomDay,mid,k) >= m){
                ans  = mid ;
                end = mid-1 ;
            }else{
                start = mid+1 ;
            }
        }
        return ans ;
    }
}
