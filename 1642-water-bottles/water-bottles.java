class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        int drink=numBottles;
        while(numExchange<=drink){
            int rem=drink%numExchange;
            drink=drink/numExchange;
            count+=drink;
            drink+=rem;
        }
        return count;
    }
}