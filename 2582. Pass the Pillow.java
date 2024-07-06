class Solution {
    public int passThePillow(int n, int time) {
        boolean forward = true ;
        int count = 1 ;
        while(time > 0){
            if(forward){
                count++ ;
                if(count == n){
                    forward = false ;
                }
            }
            else{
                count-- ;
                if(count == 1){
                    forward = true ;
                }
            }
            time-- ;
        }
        return count ;
    }
}
