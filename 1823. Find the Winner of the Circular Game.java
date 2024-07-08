1
class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            for (int i = 1; i < k; i++) {
                queue.add(queue.poll());
            }
            queue.poll();
        }
        return queue.peek();
    }
}

2
class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>() ;
        int ans = 0 ;
        for(int i = 0 ; i<n ; i++){
            arr.add(i+1) ;
        }
       
        int idx = 0 ;
       
        while(n>1){
            idx = (idx+k-1)%n ;
            arr.remove(idx) ;
            n--;
        }
       
        return arr.get(0) ;
    }
}
