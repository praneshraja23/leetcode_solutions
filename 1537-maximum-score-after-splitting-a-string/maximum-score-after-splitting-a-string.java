class Solution {
    public int maxScore(String s) {
        int max=0;
        char[] ch=s.toCharArray();
        int[] z=new int[ch.length];
        int[] o=new int[ch.length];
        if(ch[0]=='1')
        {
            z[0]=0;
            o[0]=1;
        }
        else
        {
            z[0]=1;
            o[0]=0;
        }
        for(int i=1;i<ch.length;i++)
        {
            int zero=0;
            int one=0;
            if(ch[i]=='0')
            {
                zero++;
            }
            else
            {
                one++;
            }
            z[i]=z[i-1]+zero;
            o[i]=o[i-1]+one;
        }
        for(int i=0;i<ch.length-1;i++)
        {         
            int zero=z[i];
            int one=o[ch.length-1]-o[i];
            if(zero+one>max)
            {
                max=zero+one;
            }
        }
        return max;
    }
}