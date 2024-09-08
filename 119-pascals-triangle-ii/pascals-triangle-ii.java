class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list.add(1);
                }
                else{
                    list.add(ans.get(j-1)+ans.get(j));
                }
            }
            ans=list;
        }
       return ans;
    }
}