class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int len=points.length;
        int sum=Integer.MIN_VALUE, max=Integer.MIN_VALUE;
        int mod=0;
        int flag=1;
        for(int i=0;i<len-1;i++){
            if(flag<i+1)
            flag=i+1;
            for(int j=flag;j<len;j++){
             mod=points[i][0]-points[j][0];
            if(mod<0)
             mod=-mod;
            if(mod>k)
             break;
                sum=(points[i][1]+points[j][1]+mod);
            
            if(max<sum){
             max=sum;
             flag=j-1;
             }
        }
        // if(max<sum)
        //   max=sum;
        }return max;
    }
}