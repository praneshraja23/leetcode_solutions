class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count=numBottles;
        int empty=numBottles;
        while(numExchange<=empty){
           if(numExchange<=empty){
            count++;
            empty=empty-numExchange+1;
            numExchange++;
           }
        }
        return count;
    }
}