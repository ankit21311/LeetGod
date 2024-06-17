class Solution {
    public int majorityElement(int[] nums) {
        int ele = nums[0];
        int count = 0 ;
        int n = nums.length ;
        for(int i = 1 ; i<n ; i++){
            if(nums[i] == ele){
                count++;
            }
            else if(count == 0){
                ele = nums[i];
            }
            else{
                count-- ;
            }
        }
        count = 0 ;
        for(int i = 0 ; i<n ; i++){
            if(ele == nums[i]){
                count++ ;
            }
        }
        if(count>n/2){
                return ele ;
            }
        return -1 ;
        
    }
}
