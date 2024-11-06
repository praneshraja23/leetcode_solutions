class Solution {
    public boolean canSortArray(int[] nums) {
        int len=nums.length;
        int[] bit=new int[len];
        for(int i=0;i<len;i++)
        {
            int val=nums[i];
            int count=0;
            while(val>0)
            {   
                count+=val%2;
                val/=2;
            }
            bit[i]=count;
        }
        for(int j=0;j<len;j++)
        {
            for(int i=1;i<len-j;i++)
            {
                if(nums[i-1]>nums[i])
                {
                    if(bit[i-1]!=bit[i]){
                        return false;
                    }
                    int temp=nums[i-1];
                    nums[i-1]=nums[i];
                    nums[i]=temp;
                    int b=bit[i-1];
                    bit[i-1]=bit[i];
                    bit[i]=b;
                }
            }
        }
        return true;
    }
}