class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int p1=0;
        int p2=1;
        int count=0;
        int len=nums.length;
        if(len==1){
            if(nums[0]>=target){
                return 1;
            }
            return 0;
        }
        if((nums[p1]>=target)|| (nums[p2]>=target)){
                    return 1;
                }
        count+=nums[p1]+nums[p2];
        while((p1<len) && (p2<len)){
                if((nums[p1]>=target)||(nums[p2]>=target)){
                    return 1;
                }
                if(count>=target){
                    int val=p2-p1+1;
                    if(val<min){
                        min=val;
                    }
                    p1++;
                    count-=nums[p1-1];
                }
                else if(p2!=len-1){
                    p2++;
                    count+=nums[p2];
                    }
                else{
                    p1++;
                    count-=nums[p1-1];
                }
                
            }
            if(min==Integer.MAX_VALUE){
                return 0;
            }
            return min;
    }
}