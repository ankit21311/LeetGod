class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0 , j = 0 ;
        int zero = 0 ;
        int mx = Integer.MIN_VALUE ;
        while(j<nums.length){

            if(nums[j] == 0) zero++ ;

            while(zero > k){
                if(nums[i] == 0) zero-- ;
                i++ ;
            }
            if(zero <= k){
                mx  = Math.max(mx,j-i+1) ;
            }
            j++ ;
        }
        return mx ;
    }
}
