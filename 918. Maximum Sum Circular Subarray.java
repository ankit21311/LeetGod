class Solution {
    public static int Kadane(int[] nums){
        int sum = 0 ;
        int mx = Integer.MIN_VALUE ;
        for(int i = 0 ; i<nums.length; i++){
            sum += nums[i] ;
            mx = Math.max(sum,mx) ;
            if(sum < 0 ){
                sum = 0;
            }
        }
        return mx ;
    }

    public static int KadaneMin(int[] nums){
    int sum = 0;
    int mn = Integer.MAX_VALUE;
    for(int i = 0; i < nums.length; i++){
        sum += nums[i];
        mn = Math.min(sum, mn);
        if(sum > 0){
            sum = 0;
        }
    }
    return mn;
}
public int maxSubarraySumCircular(int[] nums) {
       
       // Straight Max Ans ;
        int ans1 = Kadane(nums);

        // Circular Max Ans ;
        int totalsum = 0 ;
        for(int i : nums){
            totalsum += i ;
        }
        int ans2 = totalsum -  KadaneMin(nums) ;
        
        if (ans2 == 0) {
            return ans1;
        }
        return Math.max(ans1,ans2) ;
    }
}



//Optimal Approach

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int maxsum = 0 ;
        int minsum = 0 ;
        int mx = Integer.MIN_VALUE ;
        int mn = Integer.MAX_VALUE ;
        int totalsum = 0 ;
        for(int i : nums){
            maxsum += i ;
            mx = Math.max(mx,maxsum) ;
            if(maxsum < 0){
                maxsum = 0 ;
            }
            minsum += i ;
            mn = Math.min(mn,minsum) ;
            if(minsum > 0){
                minsum = 0 ;
            }
            totalsum += i ;
        }
        if(mn == totalsum){
            return mx ;
        }
        return Math.max(mx,totalsum-mn) ;
    }
}
