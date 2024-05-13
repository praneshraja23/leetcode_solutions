class Solution {
    public void rotate(int[] nums, int k) {
        
        int len=nums.length;
        if(len==1)
          return ;
        
        k=k%len;
        if(k<=0)
          return ;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
        return;
    }
    void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    void swap(int[] nums,int start,int end)
    {int temp=nums[start];
    nums[start]=nums[end];
    nums[end]=temp;}
}