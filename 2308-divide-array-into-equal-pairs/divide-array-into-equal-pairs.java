class Solution {
    public boolean divideArray(int[] nums) {
        int len=nums.length;
        int c=1;
        int[] hash=new int[501];
        for(int i=0;i<len;i++)
        {
            hash[nums[i]]++;
        }
        for(int i=1;i<501;i++)
        {
            if(hash[i]%2==1)
            {
                return false;
                
            }
        }
        return true;
    }
}