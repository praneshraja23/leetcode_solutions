class Solution {
    public int find(int val){
        int ans=0;
        while(val>0){
            int rem=val%2;
            if(rem==1){
                ans+=1;
            }
            val/=2;
        }
        return ans;
    }
    public int minBitFlips(int start, int goal) {
        int val=find(start^goal);
        return val;
    }
}