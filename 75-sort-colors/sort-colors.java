class Solution {
    public void sortColors(int[] nums) {
      int len=nums.length;
      int low=0,mid=0;
      int high=len-1;
      while(mid<=high){
        switch(nums[mid]){
            case 0:{
                swap(nums,low,mid);
                low++;
                mid++;
                break;
            }
            case 1:{
                mid++;
                break;
            }
            case 2:{
                swap(nums,high,mid);
                high--;
                break;
            }
        }
      }
        return;
    }
    public void swap(int[] nums,int first,int second){
        int temp=nums[first];
                nums[first]=nums[second];
                nums[second]=temp;
    }
}