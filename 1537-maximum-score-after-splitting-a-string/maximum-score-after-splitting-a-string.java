class Solution {
    public int maxScore(String s) {
        int max=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
            int z=0;
            for(int j=0;j<=i;j++)
            {
                if(ch[j]=='0')
                {
                    z++;
                }
            }
            int o=0;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[j]=='1')
                {
                    o++;
                }
            }
            if(z+o>max)
            {
                max=z+o;
            }
        }
        return max;
    }
}