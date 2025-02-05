class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        subset(0,nums,lists,new ArrayList<>());
        return lists;
    }
    public void subset(int ind,int[] arr,List<List<Integer>> lists,List<Integer> list)
    {
        lists.add(new ArrayList<>(list));
        for(int i=ind;i<arr.length;i++)
        {
            if(i>ind && arr[i]==arr[i-1]) continue;
            list.add(arr[i]);
            subset(i+1,arr,lists,list);
            list.remove(list.size()-1);
            
        }
    }
}