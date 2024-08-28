class Solution 
{
    public boolean isPalin(String s,int left,int right)
    {
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void rev(char[] ch)
    {
        int len=ch.length;
        int l=0,r=len-1;
        while(l<=r)
        {
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
    }
    public String shortestPalindrome(String s)
    {
        int len=s.length();
        int e=0;
        for(int i=len-1;i>=0;i--)
        {
            if(isPalin(s,0,i))
            {
                e=i+1;
                break;
            }
        }
        String str=s.substring(e,len);
        char[] ch=str.toCharArray();
        rev(ch);
        str=String.valueOf(ch);
        s=str+s;
        return s;
    }
}