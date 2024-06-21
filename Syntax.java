class Pair implements Comparable<Pair>{
    int first ;
    int second ;
    Pair(int first , int second){
        this.first = first ;
        this.second = second ;
    }
    @Override
    public int compareTo(Pair other){
        return Integer.compare(this.first,other.first) ;
    }
}
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.first,a.first)) ;
        for(int i = 0 ; i<customers.length ; i++){
            pq.add(new Pair(customers[i],grumpy[i])) ;
        }
        int ans = 0 ;
        while(minutes > 0){
            ans += pq.peek().first ;
            pq.poll() ;
            minutes-- ;
        }
        while(!pq.isEmpty()){
            if(pq.peek().second == 0){
                ans += pq.peek().first ;
            }
             pq.poll() ;
        }
        return ans ;
        
    }
}
