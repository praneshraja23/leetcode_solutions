class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxVal=0;
        for(int i=0;i<nums.length;i++)
        {
            maxVal|=nums[i];
        }
        int[] arr=new int[1];
        arr[0]=0;
        findNumsSubsets(0,0,nums,maxVal,nums.length,arr);
        return arr[0];
    }
    public void findNumsSubsets(int val,int j,int[] nums,int max,int n,int[] arr)
    {
        if(val==max)
        {
            arr[0]++;
        }
        for(int i=j;i<n;i++)
        {
            findNumsSubsets(val|nums[i],i+1,nums,max,n,arr);
        }

    }
}