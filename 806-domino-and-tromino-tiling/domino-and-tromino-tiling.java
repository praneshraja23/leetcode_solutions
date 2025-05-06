class Solution {
    public int numTilings(int n) {
        int MOD = 1_000_000_007;
        if(n<=2)
        {
            return n;
        }
        if(n==3)
          return 5;
        long[] arr=new long[n+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        arr[3]=5;
        for(int i=4;i<=n;i++)
        {
            arr[i]=(2*arr[i-1]%MOD+arr[i-3])%MOD;
        }
        return (int)arr[n];
    }
}