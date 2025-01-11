class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list=new ArrayList<>();
        int len1=words1.length;
        int len2=words2.length;
        if(len2==0){
            return list;
        }
        int[] check=new int[26];
        for(int i=0;i<len2;i++)
        {
            String st=words2[i];
            int[] c=new int[26];
            for(char ch:st.toCharArray())
            {
                int t=ch-97;
                c[t]++;
                check[t]=Math.max(check[t],c[t]);
            }
        }
       
        for(int i=0;i<len1;i++)
        {
            String st=words1[i];
            int[] s=new int[26];
            for(char ch:st.toCharArray())
            {
                int t=ch-97;
                s[t]++;
            }
            if(isequal(s,check))
            {
                list.add(st);
            }
        }
        
        return list;
    }
    public boolean isequal(int[] st,int[] c)
    {
       
        for(int i=0;i<26;i++)
        {
            if(st[i]<c[i])
            {
                return false;
            }
        }    
        return true;
    }
}