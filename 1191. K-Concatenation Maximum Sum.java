class Solution {
    public long Kadane(ArrayList<Integer> arr){
        long sum = 0 ;
        long mod = (long) 1e9 + 7;
        int mx = Integer.MIN_VALUE ;
        for(int i : arr){
            sum += i ;
            mx = (int)(Math.max(sum,mx) % mod) ;
            if(sum < 0){
                sum = 0 ;
            }
        }
        return mx % mod ;
    }
    public int kConcatenationMaxSum(int[] arr, int k) {
        
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : arr) {
            res.add(num);
        }

        long ans1 = Kadane(res) ;

        if(k == 1){
            if(ans1 < 0){
                return 0 ;
            }
            return (int)ans1 ;
        }

        long sum = 0 ;
        for(int i : arr){
            sum += i ;
        }

        for (int num : arr) {
            res.add(num);
        }
        long ans2 = Kadane(res) ;
        if(ans2<0){
            return 0 ;
        }
        if(sum<=0){
            return (int)(ans2) ;
        }
        long mod = (long) 1e9 + 7;
        return (int) Math.max(ans2, (ans2 + (sum * (long) (k - 2)) % mod));
    }
}
