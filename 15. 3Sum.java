Approach 1

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList() ;
        Arrays.sort(nums) ;
        int n = nums.length ;
        for(int i = 0 ; i<n-2 ; i++){
            int sum = -1*nums[i] ;
            if(i>0 && nums[i] == nums[i-1]){
                continue ;
            }
            int j = i+1 , k = n-1 ;
            while(j<k){
                if(nums[j]+nums[k] == sum){
                    List<Integer> ad = new ArrayList() ;
                    ad.add(nums[i]) ;
                    ad.add(nums[j]) ;
                    ad.add(nums[k]) ;
                    ls.add(ad) ;
                    while(j<k && nums[j] == nums[j+1]){
                        j++ ;
                    }
                    while(j<k && nums[k] == nums[k-1]){
                        k-- ;
                    }
                    j++;
                    k-- ;
                }
                else if(nums[j]+nums[k]<sum){
                    j++ ;
                }else{
                    k-- ;
                }
            }
        }
        return ls;
    }
}
