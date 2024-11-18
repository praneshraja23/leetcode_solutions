class Solution {
    public int[] decrypt(int[] code, int k) {
        int len=code.length;
        int[] result=new int[len];
        if(k==0)
        {
            return result;
        }
        int i=0;
        while(i<len)
        {   
            if(k>0)
            {
                int loop=k,sum=0;
                for(int s=i+1;loop>0;s++)
                {
                    sum+=code[s%len];
                    loop--;
                }
                result[i]=sum;
            }
            else
            {
                int loop=k,sum=0;
                for(int s=i-1;loop<0;s--)
                {   
                    if(s<0)
                    {
                        s=len-1;
                    }
                    sum+=code[s%len];
                    loop++;
                }
                result[i]=sum;
            }
            i++;
        }
        return result;
    }
}