class Solution {
    public int minSwaps(int[] nums) {
        int len=nums.length;
        int start=0;
        int max=0,count=0;
        int size=0;
        for(int i=0;i<len;i++){
                size+=nums[i];
        }
        if(len==0 || size==len){
            return 0;
        } 
        for(int i=start;i<size;i++){
                count+=nums[i];
           }
           max=count;
           start+=1;
        while(start<len){
           count=count-nums[(start-1)]+nums[(start+size-1)%len];
           if(count>max){
            max=count;
           }
           start+=1;
        }    
        return (size-max);
    }
}