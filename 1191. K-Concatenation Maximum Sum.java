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

Approach 2

class Solution {
    public static long Kadane(int[] arr){
        long sum = 0 ;
        long mod = (long)(1e9+7) ;
        int mx = Integer.MIN_VALUE ;
        for(int i : arr){
            sum += i ;
            mx = (int)(Math.max(sum,mx)%mod) ;
            if(sum < 0){
                sum = 0 ;
            }

        }
        return mx ;
    }
    public long DoubleArray(int[] arr){
        
        
        int n = arr.length ;
        int[] doubleArr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            doubleArr[i] = arr[i];
            doubleArr[n + i] = arr[i];
        }
        return Kadane( doubleArr) ;
    }
    public int kConcatenationMaxSum(int[] arr, int k) {
        long ans = Kadane(arr) ;
        long sum = 0 ;
        long mod = (long)(1e9+7) ;
        for(int i : arr){
            sum += i ;
        }
        if(k == 1){
            if(ans<0){
                return 0 ;
            }
            return (int)ans;
        }
        else if(sum <= 0){
            ans = DoubleArray(arr) ;
            if(ans<0){
                return 0 ;
            }
            return (int)ans ;
        }
        else{
            return (int)(DoubleArray(arr) + (sum * (long)(k - 2)) % mod) ;
        }
    }
}
