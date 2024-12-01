class Solution {
    public boolean checkIfExist(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for(int num:arr)
        {
            if(list.contains(num*2) ||(num%2==0 && list.contains(num/2))){
                return true;
            }
            list.add(num);
        }
        return false;
    }
}