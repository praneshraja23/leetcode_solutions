class Solution {
    public String countAndSay(int n) {
        String ans="1";
        for(int j=1;j<n;j++)
        {
            int c=1;
            String ch="";
            for(int i=1;i<ans.length();i++)
            {
                if(ans.charAt(i)==ans.charAt(i-1))
                {
                    c+=1;
                }
                else
                {
                    ch+=""+c+ans.charAt(i-1);
                    c=1;
                }
            }
            ch+=""+c+ans.charAt(ans.length()-1);
            ans=ch;
        }
        return ans;
    }
}