class Solution {
    public int mySqrt(int x) {
        if(x==1 || x==0){
            return x;
        }
        int ans=-1;
        int start=1,end=x;
        while(start<= end){
        int mid=start+(end-start)/2;
        if((long)mid*mid<(long)x){
          start=mid+1;
        }
        else if((long)mid*mid>(long)x){
            end=mid-1;
        }
        else{
            return mid;
        }
        }
        return Math.round(end);
    }
}