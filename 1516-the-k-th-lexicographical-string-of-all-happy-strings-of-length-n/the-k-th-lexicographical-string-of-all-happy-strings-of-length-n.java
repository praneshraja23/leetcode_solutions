class Solution {
    public String getHappyString(int n, int k) {
        List<String> list=new ArrayList<>();
        find("",0,n,k,list);
        return (list.size()>=k)?list.get(k-1):"";
    }
    public void find(String ans,int i,int n,int k,List<String> list)
    {
        if(i==n)
        {
            list.add(ans);
            return;
        }
        for(int j=0;j<3;j++)
        {   
            char c=(char)(97+j);
            if(ans.length()!=0 && c==ans.charAt(ans.length()-1)){
                continue;
            }
            ans+=c;
            find(ans,i+1,n,k,list);
            ans=ans.substring(0,ans.length()-1);
        }
        return;
    }
}