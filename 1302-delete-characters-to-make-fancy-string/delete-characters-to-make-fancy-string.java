class Solution {
    public String makeFancyString(String s) {
        char[] ch=s.toCharArray();
        char pre=ch[0];
        StringBuilder st=new StringBuilder();
        int count=0;
        for(int i=0;i<ch.length;)
        {
            if(count<2 && ch[i]==pre)
            {   
                st.append(ch[i]);
                count++;
                i++;
            }
            else
            {
                while(i<ch.length && pre==ch[i])
                {
                    i++;
                }
               if(i<ch.length) 
                pre=ch[i];
                count=0;
            }
        }
        return st.toString();
    }
}