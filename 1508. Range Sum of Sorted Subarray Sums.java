class Pair implements Comparable<Pair>{
    int key ;
    int value ;
    Pair(int key , int value){
        this.key = key ;
        this.value = value ;
    }
    public int compareTo(Pair that){
        return this.key-that.key;
    }
}
class Solution {
    private static final int M = (int)1e9 + 7;
    public int rangeSum(int[] nums, int n, int left, int right) {
        
        PriorityQueue<Pair> q = new PriorityQueue<>() ;
        for(int i = 0 ; i<n ; i++){
            q.add(new Pair(nums[i],i)) ;
        }

        int result = 0 ;
        for(int i = 1 ; i<=right ;i++){
            Pair p = q.poll() ;
            int a = p.key ;
            int b = p.value ;

            if(i>=left){
                result = (a+result)%M ;
            }
            if(b+1<n){
                a += nums[b+1] ;
                q.add(new Pair(a,b+1)) ;
            }

        }
        return result ;
        
    }
}
