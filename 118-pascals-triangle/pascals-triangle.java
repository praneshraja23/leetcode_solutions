class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> innerlist=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    innerlist.add(1);
                }
                else{
                    int num=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    innerlist.add(num);
                }
            }
            list.add(innerlist);
        }
        return list;
    }
}