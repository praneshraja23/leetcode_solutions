class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        recPermutation(0,nums,ans);
        return ans;
    }
    public void recPermutation(int ind,int[] nums,List<List<Integer>> ans)
    {
        if(ind==nums.length)
        {
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<nums.length;i++)
        {
            swap(i,ind,nums);
            recPermutation(ind+1,nums,ans);
            swap(i,ind,nums);
        }
    }
    public void swap(int f,int s,int[] num)
    {
        int t=num[f];
        num[f]=num[s];
        num[s]=t;
    }
}