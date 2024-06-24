class Solution {
    public boolean findSubarrays(int[] nums) {
        
        HashSet<Integer> seen = new HashSet<>() ;
        // int sum = 0 ;
        for(int i = 0 ; i<nums.length-1 ; i++){
            int sum = nums[i]+nums[i+1] ;
            if(seen.contains(sum)){
                return true ;
            }
            seen.add(sum) ;
        }
        return false ;
    }
}
