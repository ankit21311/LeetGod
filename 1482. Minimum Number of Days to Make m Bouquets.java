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
    public static int countBouquets(int[] bloomDay, int mid, int k) {
        int adjacentCount = 0;
        int bouquetCount = 0;
        for (int day : bloomDay) {
            if (day <= mid) {
                adjacentCount++;
                if (adjacentCount == k) {
                    bouquetCount++;
                    adjacentCount = 0;
                }
            } else {
                adjacentCount = 0;
            }
        }
        return bouquetCount;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int start = 0;
        int end = 0;
        for (int day : bloomDay) {
            end = Math.max(day, end);
        }
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (countBouquets(bloomDay, mid, k) >= m) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
