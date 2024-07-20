class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=0;
        int start=0,end=prices.length-1;
        int i=0,j=end;
        while(start<=end){
            int b=prices[start];
            
            if(min>b){
                min=b;
            }
            if(max<b-min){                
                max=b-min;
            }
           
            start++;
            
        }
       
        return max;
    }
}