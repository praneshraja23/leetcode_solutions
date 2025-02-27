class Solution {
    public String getPermutation(int n, int k) {
        String ans="";
        List<Integer> list=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact*=i;
            list.add(i);
        }
        list.add(n);
        k-=1;
        while(true)
        {
            ans+=list.get(k/fact);
            list.remove(list.get(k/fact));
            if(list.size()==0)
            {
                break;
            }
            k=k%fact;
            fact=fact/list.size();
        }
        return ans;
    }
}