class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int count = 0 ;
        for(int i : arr){
            if(i % 2 != 0){
                count++ ;
                if(count >= 3){
                    return true ;
                }
            }
            else{
                count = 0 ;
            }
        }
        return false ;
    }
}

Approach 2

class Solution {
   
    public boolean threeConsecutiveOdds(int[] arr) {
        int window = 0;
        for (int i = 0; i < 3 && i < arr.length; i++) {
            window += arr[i] % 2;
        }
        if (window == 3) {
            return true;
        }
        for (int i = 3; i < arr.length; i++) {
            window += arr[i] % 2;
            window -= arr[i - 3] % 2;
            if (window == 3) {
                return true;
            }
        }
        return false;
    }
}

