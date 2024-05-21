class Solution {
    public int arrangeCoins(int n) {
        long start=1;
        long end=n;
        long ans=0,c=0;
        if(start==end)
           return (int)end;
           while(start<=end){
            long mid=(start+(end-start)/2);
            c=mid*(mid+1)/2;
            if(c==n){
                return (int)mid;
            }else if(c<n){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return (int)end;
            }
}