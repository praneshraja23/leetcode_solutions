class Solution {
    public boolean divideArray(int[] nums) {
        int len=nums.length;
        int c=1;
        Arrays.sort(nums);
        for(int i=1;i<len;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                if(c%2==1)
                  return false;
                c=1;
            }
            else
            {
                c++;
            }
        }
        return true;
    }
}