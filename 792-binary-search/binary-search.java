class Solution {
    public int search(int[] nums, int target) {
        return BS(nums,0,nums.length-1,target);
    }
    public int BS(int[] nums,int start,int end, int target)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid]>target)
        {
            return BS(nums,start,mid-1,target);
        }
        return BS(nums,mid+1,end,target);
    }
}