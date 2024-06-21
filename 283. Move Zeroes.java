class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0 , j = 1 ;
        int n = nums.length ;
        while(j<n){
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[i] ;
                nums[i] = nums[j] ;
                nums[j] = temp ;
                i++;
                j++ ;
            }
            else if(nums[i] == 0 && nums[j] == 0){
                j++ ;
            }else{
                i++ ;
                j++ ;
            }
        }
    }
}

class Solution {
    public void moveZeroes(int[] nums) {

        int nonzero = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[nonzero] ;
                nums[nonzero] = nums[i] ;
                nums[i] = temp ;
                nonzero++ ;
            }
        }
        
    }
}


