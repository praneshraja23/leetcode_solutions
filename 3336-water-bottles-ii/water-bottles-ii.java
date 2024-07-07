class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count=numBottles;
        int empty=numBottles;
        int full=0;
        while(numExchange<=empty){
            empty=empty-numExchange;
            full+=1;
            numExchange++;
            if(numExchange>empty){
                empty+=full;
                count+=full;
                full=0;
            }
        }
        return count;
    }
}