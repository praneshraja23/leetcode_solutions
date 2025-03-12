class Solution {
    public int maximumCount(int[] nums) {
        int low=0,high=nums.length-1;
        int negInd=-1,posInd=nums.length;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]<0)
            {
                negInd=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }
        low=0;
        high=posInd-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>0)
            {
                posInd=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            
        }
        int pos=(nums.length-posInd);
        int neg=negInd+1;
        return (pos>neg)?pos:neg;
    }

}