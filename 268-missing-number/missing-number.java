class Solution {
    public int missingNumber(int[] nums) {
       int sum=0;
       int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
       int tot=n*(n+1)/2;
       int ans=tot-sum;
        return ans;
    }
   }