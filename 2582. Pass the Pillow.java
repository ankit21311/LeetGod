//Approach 1
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

// Approach 2
class Solution {
    public int passThePillow(int n, int time) {
        int count = 1 ;
        int dir = 1 ;
        while(time > 0){
            if(count+dir>=1 && count+dir <=n){
                count = count + dir ;
            }
            else{
                dir = dir*(-1) ;
                count = count + dir;
            }
            time-- ;
        }
        return count ;
    }
}
