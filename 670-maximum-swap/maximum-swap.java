class Solution {
    public int maximumSwap(int num) {
        String val=""+num+"";
        char[] ch=val.toCharArray();
        int len=ch.length;
        for(int i=0;i<len;i++)
        {   int c=ch[i];
            int idx=i;
            for(int j=i+1;j<len;j++)
            {
                if(c<=ch[j])
                {
                    c=ch[j];
                    idx=j;
                }
            }

            if(idx!=i && ch[i]<c)
            {
                char temp=ch[i];
                ch[i]=ch[idx];
                ch[idx]=temp;
                break;
            }
        }
        int ans=0;
        for(int i=0;i<len;i++)
        {
            ans=(ans*10)+(int)(ch[i]-48);
        }
        return ans;
    }
}