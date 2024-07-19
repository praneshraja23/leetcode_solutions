class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int element=nums[0],len=nums.length;
        for(int i=0;i<len;i++){
            if(count==0){
                element=nums[i];
                count+=1;
            }
            else if(nums[i]!=element){
                count-=1;
            }
            else{
               count+=1;
            }            
        }
           return element;
    }
}