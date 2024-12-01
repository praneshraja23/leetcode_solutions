class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash=new int[256];
        char[] ch=s.toCharArray();
        int st=0,end=0;
        int len=s.length();
        int max=0;
        if(len==0)
        {
            return max;
        }
        max=1;
        while(end<len)
        {
            if(hash[ch[end]]>=st && hash[ch[end]]>0)
            {
                int n=end-st;
                if(max<n)
                {
                    max=n;
                }
                st=hash[ch[end]];
            }
            hash[ch[end]]=end+1;
            end++;
        }
        if(hash[ch[end-1]]>=st && hash[ch[end-1]]>0)
            {
                int n=end-st;
                if(max<n)
                {
                    max=n;
                }
                st=hash[ch[end-1]];
            }
        return max;
    }
}