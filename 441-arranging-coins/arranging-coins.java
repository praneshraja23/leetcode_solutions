class Solution {
    public int arrangeCoins(int n) {
        int start=1;
        int end=n;
        long ans=0,c=0;
        if(start==end)
           return end;
        long mid=(start+(end-start)/2);
        for(int i=1;i<=mid;i++){
            c+=i;
            if(c==n){
                ans=i;
                return (int)ans;
            }else if(c<n){
                ans=i;
            }else{
                break;
            }
        }
        return (int)ans;
            }
}