class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smallerNum=new ArrayList<>();
        List<Integer> greaterNum=new ArrayList<>();
        int eqCount=0;
        int len=nums.length;
        for(int num:nums)
        {
            if(num==pivot)
            {
               eqCount++;
            }
            else if(num<pivot)
            {
                smallerNum.add(num);
            }
            else
            {
                greaterNum.add(num);
            }
        }
        int ind=0;
        for(int num:smallerNum)
        {
            nums[ind++]=num;
        }
        for(int i=0;i<eqCount;i++)
        {
            nums[ind++]=pivot;
        }
        for(int num:greaterNum)
        {
            nums[ind++]=num;
        }
        return nums;
    }
}