class Solution {
    public void reverseString(char[] s) {
        reverse(s,s[0],0,s.length-1);
    }
    public void reverse(char[] s,char c,int st,int len)
    {
        if(len==0)
        {
            s[len]=c;
            return;
        }
        reverse(s,s[st+1],st+1,len-1);
        s[len]=c;
    }
}