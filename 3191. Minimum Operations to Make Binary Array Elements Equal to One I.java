class Solution {
    public int minOperations(int[] nums) {
        
        int n = nums.length ;
        int flips = 0 ;
        int FlipCountCurrent = 0 ;

        for(int i = 0 ; i<n ; i++){
            if(i >= 3 && nums[i-3] == 2){
                FlipCountCurrent-- ;
            }

            if(FlipCountCurrent%2 == nums[i]){

                if(i+3 > n){
                    return -1 ;
                }
                FlipCountCurrent++ ;
                flips++ ;
                nums[i] = 2 ;
            }
        }

        return flips ;
    }
}
