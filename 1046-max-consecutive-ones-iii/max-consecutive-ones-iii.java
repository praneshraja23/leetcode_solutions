class Solution {
    public int longestOnes(int[] nums, int k) {
        int len=nums.length;
        int l=0,r=0,maxlen=0;
        int zeros=0;
        while(r<len){
            if(nums[r]==0){
                zeros++;
            }
            if(zeros>k){
                 if(nums[l]==0){
                zeros--;
               }
                l++;
            }
            if(zeros<=k){
            maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        return maxlen;
    }
}