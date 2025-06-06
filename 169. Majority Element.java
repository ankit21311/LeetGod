
Majority Element :
n/2 ======> 1
n/3 ======> 2
n/4 ======> 3

it means n/k ======> (k-1)


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


class Solution {
    public int majorityElement(int[] nums) {
        int ele = Integer.MIN_VALUE;
        int count = 0 ;
        int n = nums.length ;
        for(int i = 0 ; i<n ; i++){
            if(nums[i] == ele){
                count++;
            }
            else if(count == 0){
                ele = nums[i];
                count++ ;
            }
            else{
                count-- ;
            }
        }
        // Not necessary as it is sure there will be one majority element 
        // count = 0 ;
        // for(int i = 0 ; i<n ; i++){
        //     if(ele == nums[i]){
        //         count++ ;
        //     }
        // }
        // if(count>n/2){
        //         return ele ;
        //     }
        // return -1 ;
        return ele ;
    }
}
