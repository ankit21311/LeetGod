class Solution {
    public static void reverse(int[] nums){
        int i = 0 , j = nums.length-1 ;
        while(i<j){
            int temp = nums[i] ;
            nums[i] = nums[j] ;
            nums[j] = temp ;
            i++ ;
            j-- ;
        }
    }
    public void nextPermutation(int[] nums) {
        
        int idx = -1 ;
        int n = nums.length ;
        for(int i = n-2 ; i>=0 ; i--){
            if(nums[i]<nums[i+1]){
                idx = i ;
                break ;
            }
        }
        if(idx == -1){
           reverse(nums);
            return ;
        }
        for(int i = n-1 ; i>=0 ; i--){
            if(nums[i]>nums[idx]){
                int temp = nums[idx] ;
                nums[idx] = nums[i] ;
                nums[i] = temp ;
                break ;
            }
        }
        Arrays.sort(nums,idx+1,n) ;
    }
}
