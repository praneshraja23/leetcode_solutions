class Solution {
    public int[] applyOperations(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int zeroPtr=0;
        int numPtr=-1;
        while(numPtr<len)
        {
            while(zeroPtr<len && nums[zeroPtr]!=0)
            {
                zeroPtr++;
            }
            numPtr=zeroPtr+1;
            while(numPtr<len && nums[numPtr]==0)
            {
            numPtr++;
            }
            if(zeroPtr<len && numPtr<len && numPtr>zeroPtr)
            {
                nums[zeroPtr]=nums[numPtr];
                nums[numPtr]=0;
                zeroPtr++;
            }

        }
        return nums;
    }
}