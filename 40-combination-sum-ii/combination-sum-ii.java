class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(candidates);
        uniqueCombination(0,candidates,target,lists,new ArrayList<>());
        return lists;
    }
    public void uniqueCombination(int ind,int[] arr,int target,List<List<Integer>> lists,List<Integer> list)
    {
        if(target==0)
        {
            lists.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<arr.length;i++)
        {
            if(i>ind && arr[i]==arr[i-1]) continue;

            if(arr[i]>target) break;
            list.add(arr[i]);
            uniqueCombination(i+1,arr,target-arr[i],lists,list);
            list.removeLast();
        }
    }
}