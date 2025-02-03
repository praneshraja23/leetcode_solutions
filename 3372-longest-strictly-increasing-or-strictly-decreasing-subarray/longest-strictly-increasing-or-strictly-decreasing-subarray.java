class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1,pos=1,neg=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]>0)
            {
                pos++;
            }
            else
            {
                if(max<pos)
                {
                    max=pos;
                }
                pos=1;
            }
            if(nums[i]-nums[i-1]<0)
            {
                neg++;
            }
            else
            {
                if(max<neg)
                {
                    max=neg;
                }
                neg=1;
            }
        }
        max=Math.max(max,Math.max(pos,neg));
        return max;
    }
}