class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length ;
        int start = 0 , end = n-1 ;
        int[] res = {-1,-1} ;
        int mid = 0 ;
        int left = -1 , right = -1 ;
        while(start <= end){
            mid = start+(end-start)/2 ;
            if(nums[mid] == target){
                left = mid ;
                end = mid-1 ;
            }
            else if(nums[mid] > target){
                end = mid-1 ;
            }else{
                start = mid+1 ;
            }
        }
        res[0] = left ;
        start = 0;
        end = n-1 ;
        while(start <= end){
            mid = start+(end-start)/2 ;
            if(nums[mid] == target){
                right = mid;
                start = mid+1 ;
            }
            else if(nums[mid] > target){
                end = mid-1 ;
            }else{
                start = mid+1 ;
            }
        }
        res[1] = right ;
        return res ;
    }
}
