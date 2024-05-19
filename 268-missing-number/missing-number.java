class Solution {
    public int missingNumber(int[] nums) {
        sort(nums);
        int i;
        for(i=0;i<nums.length;i++){
            if(i!=nums[i])
              return i;
        }
        return i;
    }
    public void sort(int[] nums){
        int i=0;
        while(i<nums.length){
            int value=nums[i];
            if(value!=nums.length && nums[i]!=nums[value]){
                swap(nums,i,value);
            }
            else
            i++;
        }
    }
    public void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}