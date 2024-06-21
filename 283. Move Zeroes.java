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
        int n = nums.length;
        int nonZeroPos = 0; // Pointer to track the position of the next non-zero element

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // Swap only if i is not the same as nonZeroPos to avoid unnecessary self-swaps
                if (i != nonZeroPos) {
                    int temp = nums[i];
                    nums[i] = nums[nonZeroPos];
                    nums[nonZeroPos] = temp;
                }
                nonZeroPos++;
            }
        }

        // No need to fill zeroes explicitly, as they are already in place after the swaps
    }
}
