class Solution {
    public int sumDigit(int a)
    {   int ans=0;
        while(a>0)
            {
             int r= a%10;
             ans+=r;
             a/=10;   
            }
            return ans;
    }
    public int getLucky(String s, int k)
    {
        int len=s.length();
        int ans=0;
        for(int i=0;i<len;i++)
        {
            int a=(int)s.charAt(i);
            ans+=sumDigit(a-96);
        }
        for(int i=1;i<k;i++){
            ans=sumDigit(ans);
        }
        return ans;
    }
}