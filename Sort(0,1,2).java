Leet Code 75

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length ;
        int[] arr = new int[3] ;
        int element = 0 ;
        for(int i = 0 ; i < n ; i++){
            element = nums[i] ;
            arr[element]++ ;
        }
        int count = 0 ;
        int k = 0 ;
        for(int i = 0 ; i<3 ; i++){
            count = arr[i] ;
            while(count > 0){
                nums[k] = i ;
                k++ ;
                count-- ;
            }
        }
    }
}
