class Solution {
    public int searchInsert(int[] nums, int target) {
       int len=nums.length-1;
       int start=0,end=len;
       while(start<=end){
        int mid =start+(end-start)/2;
        if(nums[mid]<target){
            start=mid+1;
        }else if(nums[mid]>target){
            end=mid-1;
        }else{
            return mid;
        }
       }
       return start; 
    }
}