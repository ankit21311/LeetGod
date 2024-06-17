class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3] ;
        int element = 0 ; 
        for(int i = 0 ; i<nums.length;i++){
            element = nums[i];
            arr[element]++ ;
        }

        int k = 0 ;
        for(int i = 0 ; i<3; i++){
            while(arr[i]>0){
                nums[k] = i ;
                arr[i]-- ;
                k++ ;
            }
        }
    }
}
