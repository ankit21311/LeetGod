Approach 1
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int TBottle = numBottles , newBottle = numBottles ;
        while(newBottle >  numExchange){//15
            int empty = newBottle % numExchange ; //empty = 1
            newBottle = newBottle/numExchange ; //  newBottle = 1/3
            TBottle += newBottle ; // tb = 13
            newBottle = newBottle + empty ; // newBOTTLE = 1
        }
        return TBottle ;
    }
}

Approach 2

  class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int extra = (numBottles-1)/(numExchange-1) ;
        return  numBottles+extra ;
    }
}
