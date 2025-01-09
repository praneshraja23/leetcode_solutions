class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int p=-1;
        if(nums[s]>nums[e]){
            p=findPivot(s,e,nums);
        }
        else
        {
            return bs(nums,s,e,target);
        }
        int ans=-1;
        if(p!=-1)
        {   
            ans=bs(nums,s,p,target);
            if(ans==-1)
                ans=bs(nums,p+1,e,target);
        }
        return ans;
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
            if(arr[m]>target)
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return -1;
    }
    public int findPivot(int s,int e,int[] arr)
    {
        
        while(s<e)
        {
            int m=s+(e-s)/2;
            if(arr[m]>arr[m+1])
            {
                return m;
            }
            if(arr[m]<arr[m-1])
            {
                return m-1;
            }
            if(arr[m]<=arr[s])
            {
                e=m-1;
            }
            else
            {
                s=m+1;
            }
        }
        return s;
    }
}