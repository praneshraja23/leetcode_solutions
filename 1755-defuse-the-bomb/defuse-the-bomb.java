class Solution {
    public int[] decrypt(int[] code, int k) {
        int len=code.length;
        int[] result=new int[len];
        if(k==0)
        {
            return result;
        }
        int start=1,end=start+k-1,sum=0;
        if(k<0)
        {
            start=len+k;
            end=len-1;
        }
        for(int i=start;i<=end;i++)
        {
            sum+=code[i%len];
        }
        for(int i=0;i<len;i++)
        {
            result[i]=sum;
            sum-=code[start%len];
            sum+=code[(end+1)%len];
            start++;
            end++;
        }
        return result;
    }
}