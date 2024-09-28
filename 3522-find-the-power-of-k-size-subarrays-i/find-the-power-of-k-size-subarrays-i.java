class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int len=nums.length;
        int[] arr=new int[len-k+1];
        int start=0,end=k-1;
        
        while(end<len)
        {   int c=1;
            for(int i=start+1;i<=end;i++)
            {   
                if(nums[i-1]+1!=nums[i])
                {
                    c=0;
                    break;
                }
            }
            if(c==1)
            {
                arr[start]=nums[end];
            }
            else
            {
                arr[start]=-1;
            }
            start++;
            end++;
        }
        return arr;
    }
}