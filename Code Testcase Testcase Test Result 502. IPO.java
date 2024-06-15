class Pair implements Comparable<Pair> {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(this.first, other.first);
    }
}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Pair> pq = new PriorityQueue<>() ;
        int n = capital.length ;
        for(int i = 0 ; i < n ; i++){
            pq.add(new Pair(capital[i],profits[i])) ;
        }
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder()) ;
        int i = 0 ;
        while(k>0){
            while(!pq.isEmpty() && pq.peek().first <= w){
                que.add(pq.poll().second) ;
            }
            if(que.isEmpty()){
                break ;
            }
            w += que.poll() ;
            k--;
            
        }
        return w ;

    }
}
