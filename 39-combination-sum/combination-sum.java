class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists= new ArrayList<>();
        findCombination(0,candidates,target,lists,new ArrayList<Integer>());
        return lists;
    }
    public void findCombination(int ind,int[] arr,int target,List<List<Integer>> lists,List<Integer> list){
        if(ind==arr.length)
        {
            if(target==0){
                lists.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[ind]<=target)
        {
            list.add(arr[ind]);
            findCombination(ind,arr,target-arr[ind],lists,list);
            list.removeLast();
        }
        findCombination(ind+1,arr,target,lists,list);
    }
}