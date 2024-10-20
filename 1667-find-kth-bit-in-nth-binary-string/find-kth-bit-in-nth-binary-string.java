class Solution {
    public char findKthBit(int n, int k) {
        if(k==1)
        {
            return '0';
        }
        String str="0";
        
        for(int i=2;i<=n;i++)
        {
            StringBuilder st=new StringBuilder();
            st.append(str).append("1").append(reverse(str));
            str=st.toString();
        }
        return str.charAt(k-1);
    }

    public String reverse(String s)
    {
        StringBuilder st=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=(s.charAt(i)=='1')?'0':'1';
            st.append(ch);
        }
        return st.toString();
    }
}