class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        return bs(nums,s,e,target);   
    }
    public int bs(int[] arr,int s,int e,int target)
    {
        while(s<=e)
        {   
            int m=s+(e-s)/2;
            if(arr[m]==target)
            {
                return m;
            }
        if(arr[s]<=arr[m])
        {
            if(arr[s]<=target && arr[m]>=target)
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        else
        {
            if(arr[m]<target && arr[e]>=target)
            {
                s=m+1;
            }
            else
            {
                e=m-1;
            }
        }
           
        }
        return -1;
    }
    
}