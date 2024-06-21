class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int unsatisfy = 0 ; 
        for(int i = 0 ; i<minutes ; i++){
            unsatisfy += customers[i]*grumpy[i] ;
        }
        int j = minutes ;
        int i = 0 ; 
        int totalunsatisfy =  unsatisfy ;
        while(j<customers.length){
            unsatisfy += customers[j]*grumpy[j];
            unsatisfy -= customers[i]*grumpy[i] ;

            totalunsatisfy = Math.max(unsatisfy, totalunsatisfy) ;
            j++ ;
            i++ ;
        }
        for(int k = 0 ; k<customers.length ; k++){
             totalunsatisfy += customers[k]*(1-grumpy[k]) ;
        }
        return totalunsatisfy ;
    }
}
