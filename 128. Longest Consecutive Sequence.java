class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums) ;
        int n = nums.length , prev = Integer.MIN_VALUE , mx = 0 , count =  0 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i]-1 == prev){
                prev = nums[i] ;
                count++ ;
            }
            else if(nums[i] != prev){
                prev = nums[i] ;
                count = 1 ;
            }
            mx = Math.max(mx,count) ;
        }
        return mx ;
    }
}
