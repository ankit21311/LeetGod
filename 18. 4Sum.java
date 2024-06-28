class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums) ;
        List<List<Integer>> ls = new ArrayList() ;
        int n = nums.length ;
        for(int i = 0 ; i<n-3 ; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue ;
            }
            for(int j = i+1 ; j<n-2 ; j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                continue ;
            }
            long sum = nums[i]+nums[j] ;
            int k = j+1 , l = n-1 ; 
            while(k<l){
                if(sum+nums[k]+nums[l] == target){
                    List<Integer> ad = new ArrayList() ;
                    ad.add(nums[i]) ;
                    ad.add(nums[j]) ;
                    ad.add(nums[k]) ;
                    ad.add(nums[l]) ;
                    ls.add(ad) ;
                    while(k<l && nums[k] == nums[k+1]){
                        k++ ;
                    }
                    while(k<l && nums[l] == nums[l-1]){
                        l-- ;
                    }
                    k++ ;
                    l-- ;
                }
                else if(sum+nums[k]+nums[l] < target){
                    k++ ;
                }
                else{
                    l-- ;
                }
            }
            }
        }
        return ls ;
    }
}
