class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int flips = 0 ;

        boolean[] isFlips = new boolean[nums.length] ;

        int flipCount = 0 ;
        for(int i = 0 ; i<nums.length; i++){
            if(i >= k && isFlips[i-k] == true){
                flipCount-- ;
            }
            if(flipCount % 2 == nums[i]){

                if(i+k > nums.length){
                    return -1 ;
                }
                flipCount++ ;
                flips++ ;
                isFlips[i] = true ;
            }
        }


        return flips ;
    }
}

// Approach 2

class Solution {
    public int minKBitFlips(int[] nums, int k) {

        int flips = 0 ;

    
        int flipCount = 0 ;
        for(int i = 0 ; i<nums.length; i++){
            if(i >= k && nums[i-k] == 2){
                flipCount-- ;
            }
            if(flipCount % 2 == nums[i]){

                if(i+k > nums.length){
                    return -1 ;
                }
                flipCount++ ;
                flips++ ;
                nums[i] = 2 ;
            }
        }


        return flips ;
    }
}
