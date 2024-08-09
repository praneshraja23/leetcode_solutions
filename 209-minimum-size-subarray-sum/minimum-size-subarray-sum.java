class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int p1=0;
        int p2=0;
        int count=0;
        int len=nums.length;
        if(len==1){
            if(nums[0]>=target){
                return 1;
            }
            return 0;
        }
        while(p2<len){
                count+=nums[p2];
                while(count>=target){
                    int val=p2-p1+1;
                    if(val<min){
                        min=val;
                    }
                    count-=nums[p1];
                    p1++;
                }
                    p2++;                
            }
            if(min==Integer.MAX_VALUE){
                return 0;
            }
            return min;
    }
}