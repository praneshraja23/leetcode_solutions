class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        helper(ans,new ArrayList<String>(),s);
        return ans;
    }
    public void helper(List<List<String>> ans,List<String> list,String s)
    {
        if(s.length()==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            String str=s.substring(0,i+1);
            if(!ispalin(str))
            {
                continue;
            }
            list.add(str);
            helper(ans,list,s.substring(i+1,len));
            list.remove(list.size()-1);
        }
    }
    public boolean ispalin(String s)
    {
        int len=s.length();
        int start=0;
        int end=len-1;
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}